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

public val OutlineGroup.Options: ImageVector
    get() {
        if (_options != null) {
            return _options!!
        }
        _options = Builder(name = "Options", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(7.0f, 14.18f)
                verticalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 3.0f)
                verticalLineTo(14.18f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 5.64f)
                verticalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(19.82f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -5.64f)
                close()
                moveTo(6.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.0f, -2.82f)
                lineTo(19.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                verticalLineToRelative(7.18f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 5.64f)
                lineTo(17.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                lineTo(19.0f, 15.82f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 13.0f)
                close()
                moveTo(18.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, -4.0f, 2.82f)
                verticalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineTo(7.82f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.0f, 5.0f)
                close()
                moveTo(12.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 1.0f, -1.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 6.0f)
                close()
            }
        }
        .build()
        return _options!!
    }

private var _options: ImageVector? = null
