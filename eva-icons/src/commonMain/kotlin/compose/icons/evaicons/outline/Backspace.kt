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

public val OutlineGroup.Backspace: ImageVector
    get() {
        if (_backspace != null) {
            return _backspace!!
        }
        _backspace = Builder(name = "Backspace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(-24.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.14f, 4.0f)
                horizontalLineTo(10.37f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.0f, 0.78f)
                lineToRelative(-0.1f, 0.11f)
                lineToRelative(-6.0f, 7.48f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.11f, 1.37f)
                lineToRelative(6.0f, 5.48f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.0f, 0.78f)
                horizontalLineToRelative(9.77f)
                arcTo(1.84f, 1.84f, 0.0f, false, false, 22.0f, 18.18f)
                verticalLineTo(5.82f)
                arcTo(1.84f, 1.84f, 0.0f, false, false, 20.14f, 4.0f)
                close()
                moveTo(20.0f, 18.0f)
                horizontalLineTo(10.37f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.67f, -0.26f)
                lineTo(4.37f, 12.89f)
                lineTo(9.75f, 6.22f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.37f, 6.0f)
                horizontalLineTo(20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.29f, 14.71f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 0.0f)
                lineTo(14.0f, 13.41f)
                lineToRelative(1.29f, 1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.42f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.42f)
                lineTo(15.41f, 12.0f)
                lineToRelative(1.3f, -1.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, -1.42f)
                lineTo(14.0f, 10.59f)
                lineToRelative(-1.29f, -1.3f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.42f, 1.42f)
                lineTo(12.59f, 12.0f)
                lineToRelative(-1.3f, 1.29f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.29f, 14.71f)
                close()
            }
        }
        .build()
        return _backspace!!
    }

private var _backspace: ImageVector? = null
