package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Transportforlondon: ImageVector
    get() {
        if (_transportforlondon != null) {
            return _transportforlondon!!
        }
        _transportforlondon = Builder(name = "Transportforlondon", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.25f)
                arcToRelative(9.73f, 9.73f, 0.0f, false, false, -9.49f, 7.5f)
                lineTo(0.0f, 9.75f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(2.51f)
                arcToRelative(9.73f, 9.73f, 0.0f, false, false, 9.49f, 7.5f)
                curveToRelative(4.62f, 0.0f, 8.48f, -3.2f, 9.49f, -7.5f)
                lineTo(24.0f, 14.25f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-2.51f)
                arcTo(9.73f, 9.73f, 0.0f, false, false, 12.0f, 2.25f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(2.5f, 0.0f, 4.66f, 1.56f, 5.56f, 3.75f)
                lineTo(6.44f, 9.75f)
                arcTo(6.02f, 6.02f, 0.0f, false, true, 12.0f, 6.0f)
                close()
                moveTo(6.44f, 14.25f)
                horizontalLineToRelative(11.12f)
                arcTo(6.02f, 6.02f, 0.0f, false, true, 12.0f, 18.0f)
                arcToRelative(6.02f, 6.02f, 0.0f, false, true, -5.56f, -3.75f)
                close()
            }
        }
        .build()
        return _transportforlondon!!
    }

private var _transportforlondon: ImageVector? = null
