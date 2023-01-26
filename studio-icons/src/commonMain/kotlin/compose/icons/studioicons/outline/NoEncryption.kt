package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.NoEncryption: ImageVector
    get() {
        if (_noEncryption != null) {
            return _noEncryption!!
        }
        _noEncryption = Builder(name = "NoEncryption", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.9f, 6.0f)
                curveToRelative(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f)
                reflectiveCurveToRelative(3.1f, 1.39f, 3.1f, 3.1f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.66f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(5.56f)
                lineToRelative(2.0f, 2.0f)
                verticalLineTo(10.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                curveToRelative(-2.32f, 0.0f, -4.26f, 1.59f, -4.82f, 3.74f)
                lineTo(8.9f, 6.46f)
                verticalLineTo(6.0f)
                close()
                moveTo(4.41f, 4.81f)
                lineTo(3.0f, 6.22f)
                lineToRelative(2.04f, 2.04f)
                curveTo(4.42f, 8.6f, 4.0f, 9.25f, 4.0f, 10.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.78f)
                lineToRelative(1.0f, 1.0f)
                lineToRelative(1.41f, -1.41f)
                lineTo(4.41f, 4.81f)
                close()
                moveTo(6.0f, 20.0f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(0.78f)
                lineToRelative(10.0f, 10.0f)
                horizontalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _noEncryption!!
    }

private var _noEncryption: ImageVector? = null
