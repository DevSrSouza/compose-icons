package compose.icons.evaicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.evaicons.OutlineGroup

public val OutlineGroup.Hash: ImageVector
    get() {
        if (_hash != null) {
            return _hash!!
        }
        _hash = Builder(name = "Hash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineToRelative(-24.0f, -0.0f)
                lineToRelative(-0.0f, -24.0f)
                lineToRelative(24.0f, -0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 14.0f)
                horizontalLineTo(15.7f)
                lineToRelative(0.73f, -4.0f)
                horizontalLineTo(20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                horizontalLineTo(16.79f)
                lineToRelative(0.69f, -3.81f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.64f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.22f, 0.82f)
                lineTo(14.67f, 8.0f)
                horizontalLineTo(10.79f)
                lineToRelative(0.69f, -3.81f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.64f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.22f, 0.82f)
                lineTo(8.67f, 8.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(8.3f)
                lineToRelative(-0.73f, 4.0f)
                horizontalLineTo(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                horizontalLineTo(7.21f)
                lineToRelative(-0.69f, 3.81f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.36f, 21.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.22f, -0.82f)
                lineTo(9.33f, 16.0f)
                horizontalLineToRelative(3.88f)
                lineToRelative(-0.69f, 3.81f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.36f, 21.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.22f, -0.82f)
                lineTo(15.33f, 16.0f)
                horizontalLineTo(20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(9.7f, 14.0f)
                lineToRelative(0.73f, -4.0f)
                horizontalLineTo(14.3f)
                lineToRelative(-0.73f, 4.0f)
                close()
            }
        }
        .build()
        return _hash!!
    }

private var _hash: ImageVector? = null
