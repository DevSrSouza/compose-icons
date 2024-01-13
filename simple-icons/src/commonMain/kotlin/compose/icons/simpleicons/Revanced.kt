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

public val SimpleIcons.Revanced: ImageVector
    get() {
        if (_revanced != null) {
            return _revanced!!
        }
        _revanced = Builder(name = "Revanced", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.1f, 0.0f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, false, -0.23f, 0.42f)
                lineToRelative(6.88f, 11.93f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, false, 0.48f, 0.0f)
                lineTo(19.13f, 0.42f)
                arcTo(0.28f, 0.28f, 0.0f, false, false, 18.9f, 0.0f)
                close()
                moveTo(0.5f, 0.0f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, false, -0.3f, 0.46f)
                lineTo(10.43f, 23.8f)
                curveToRelative(0.05f, 0.12f, 0.17f, 0.2f, 0.3f, 0.2f)
                horizontalLineToRelative(2.54f)
                curveToRelative(0.13f, 0.0f, 0.25f, -0.08f, 0.3f, -0.2f)
                lineTo(23.8f, 0.46f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, false, -0.3f, -0.46f)
                horizontalLineToRelative(-2.32f)
                arcToRelative(0.24f, 0.24f, 0.0f, false, false, -0.21f, 0.14f)
                lineTo(12.2f, 20.08f)
                arcToRelative(0.23f, 0.23f, 0.0f, false, true, -0.42f, 0.0f)
                lineTo(3.03f, 0.14f)
                arcTo(0.23f, 0.23f, 0.0f, false, false, 2.82f, 0.0f)
                close()
            }
        }
        .build()
        return _revanced!!
    }

private var _revanced: ImageVector? = null
