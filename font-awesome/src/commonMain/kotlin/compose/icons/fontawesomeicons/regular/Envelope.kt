package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Envelope: ImageVector
    get() {
        if (_envelope != null) {
            return _envelope!!
        }
        _envelope = Builder(name = "Envelope", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 64.0f)
                lineTo(48.0f, 64.0f)
                curveTo(21.49f, 64.0f, 0.0f, 85.49f, 0.0f, 112.0f)
                verticalLineToRelative(288.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(416.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                lineTo(512.0f, 112.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(464.0f, 112.0f)
                verticalLineToRelative(40.81f)
                curveToRelative(-22.42f, 18.26f, -58.17f, 46.65f, -134.59f, 106.49f)
                curveToRelative(-16.84f, 13.25f, -50.2f, 45.07f, -73.41f, 44.7f)
                curveToRelative(-23.21f, 0.38f, -56.58f, -31.46f, -73.41f, -44.7f)
                curveTo(106.18f, 199.46f, 70.43f, 171.07f, 48.0f, 152.8f)
                lineTo(48.0f, 112.0f)
                horizontalLineToRelative(416.0f)
                close()
                moveTo(48.0f, 400.0f)
                lineTo(48.0f, 214.4f)
                curveToRelative(22.91f, 18.25f, 55.41f, 43.86f, 104.94f, 82.65f)
                curveToRelative(21.86f, 17.2f, 60.13f, 55.19f, 103.06f, 54.96f)
                curveToRelative(42.72f, 0.23f, 80.51f, -37.2f, 103.05f, -54.95f)
                curveToRelative(49.53f, -38.78f, 82.03f, -64.4f, 104.95f, -82.65f)
                lineTo(464.0f, 400.0f)
                lineTo(48.0f, 400.0f)
                close()
            }
        }
        .build()
        return _envelope!!
    }

private var _envelope: ImageVector? = null
