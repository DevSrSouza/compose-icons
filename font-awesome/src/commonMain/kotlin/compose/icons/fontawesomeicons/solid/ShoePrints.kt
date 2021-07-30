package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ShoePrints: ImageVector
    get() {
        if (_shoePrints != null) {
            return _shoePrints!!
        }
        _shoePrints = Builder(name = "ShoePrints", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 160.0f)
                horizontalLineToRelative(32.0f)
                lineTo(224.0f, 32.0f)
                horizontalLineToRelative(-32.0f)
                curveToRelative(-35.35f, 0.0f, -64.0f, 28.65f, -64.0f, 64.0f)
                reflectiveCurveToRelative(28.65f, 64.0f, 64.0f, 64.0f)
                close()
                moveTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.35f, 28.65f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(32.0f)
                lineTo(96.0f, 352.0f)
                lineTo(64.0f, 352.0f)
                curveToRelative(-35.35f, 0.0f, -64.0f, 28.65f, -64.0f, 64.0f)
                close()
                moveTo(337.46f, 288.0f)
                curveToRelative(-34.91f, 0.0f, -76.16f, 13.12f, -104.73f, 32.0f)
                curveToRelative(-24.79f, 16.38f, -44.52f, 32.0f, -104.73f, 32.0f)
                verticalLineToRelative(128.0f)
                lineToRelative(57.53f, 15.97f)
                curveToRelative(26.21f, 7.28f, 53.01f, 13.12f, 80.31f, 15.05f)
                curveToRelative(32.69f, 2.31f, 65.6f, 0.67f, 97.58f, -6.2f)
                curveTo(472.9f, 481.3f, 512.0f, 429.22f, 512.0f, 384.0f)
                curveToRelative(0.0f, -64.0f, -84.18f, -96.0f, -174.54f, -96.0f)
                close()
                moveTo(491.42f, 7.19f)
                curveTo(459.44f, 0.32f, 426.53f, -1.33f, 393.84f, 0.99f)
                curveToRelative(-27.3f, 1.93f, -54.1f, 7.77f, -80.31f, 15.04f)
                lineTo(256.0f, 32.0f)
                verticalLineToRelative(128.0f)
                curveToRelative(60.2f, 0.0f, 79.94f, 15.62f, 104.73f, 32.0f)
                curveToRelative(28.57f, 18.88f, 69.82f, 32.0f, 104.73f, 32.0f)
                curveTo(555.82f, 224.0f, 640.0f, 192.0f, 640.0f, 128.0f)
                curveToRelative(0.0f, -45.22f, -39.1f, -97.3f, -148.58f, -120.81f)
                close()
            }
        }
        .build()
        return _shoePrints!!
    }

private var _shoePrints: ImageVector? = null
