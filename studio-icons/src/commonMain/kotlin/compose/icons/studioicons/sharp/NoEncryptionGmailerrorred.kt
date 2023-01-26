package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.NoEncryptionGmailerrorred: ImageVector
    get() {
        if (_noEncryptionGmailerrorred != null) {
            return _noEncryptionGmailerrorred!!
        }
        _noEncryptionGmailerrorred = Builder(name = "NoEncryptionGmailerrorred", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.9f, 6.0f)
                curveToRelative(0.0f, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f)
                reflectiveCurveToRelative(3.1f, 1.39f, 3.1f, 3.1f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.66f)
                lineTo(20.0f, 17.56f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(6.22f)
                curveToRelative(0.0f, -2.61f, -1.91f, -4.94f, -4.51f, -5.19f)
                curveToRelative(-2.53f, -0.25f, -4.72f, 1.41f, -5.32f, 3.7f)
                lineTo(8.9f, 6.46f)
                verticalLineTo(6.0f)
                close()
                moveTo(4.41f, 4.81f)
                lineTo(3.0f, 6.22f)
                lineTo(4.78f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(14.78f)
                lineToRelative(1.0f, 1.0f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }
        .build()
        return _noEncryptionGmailerrorred!!
    }

private var _noEncryptionGmailerrorred: ImageVector? = null
