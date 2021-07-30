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

public val SimpleIcons.Azuredevops: ImageVector
    get() {
        if (_azuredevops != null) {
            return _azuredevops!!
        }
        _azuredevops = Builder(name = "Azuredevops", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.877f)
                lineTo(2.247f, 5.91f)
                lineToRelative(8.405f, -3.416f)
                lineTo(10.652f, 0.022f)
                lineToRelative(7.37f, 5.393f)
                lineTo(2.966f, 8.338f)
                verticalLineToRelative(8.225f)
                lineTo(0.0f, 15.707f)
                close()
                moveTo(24.0f, 4.427f)
                verticalLineToRelative(14.651f)
                lineToRelative(-5.753f, 4.9f)
                lineToRelative(-9.303f, -3.057f)
                verticalLineToRelative(3.056f)
                lineToRelative(-5.978f, -7.416f)
                lineToRelative(15.057f, 1.798f)
                lineTo(18.023f, 5.415f)
                close()
            }
        }
        .build()
        return _azuredevops!!
    }

private var _azuredevops: ImageVector? = null
