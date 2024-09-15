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

public val SolidGroup.HandPointDown: ImageVector
    get() {
        if (_handPointDown != null) {
            return _handPointDown!!
        }
        _handPointDown = Builder(name = "HandPointDown", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(91.83f, 467.2f)
                lineTo(91.83f, 317.97f)
                curveToRelative(-8.25f, 5.84f, -16.56f, 10.57f, -24.92f, 14.15f)
                curveTo(35.1f, 345.75f, -0.01f, 322.22f, 0.0f, 288.0f)
                curveToRelative(0.01f, -18.62f, 10.9f, -32.2f, 29.09f, -40.0f)
                curveToRelative(28.29f, -12.12f, 64.33f, -78.65f, 77.32f, -107.53f)
                curveToRelative(7.96f, -17.86f, 25.48f, -28.45f, 43.85f, -28.46f)
                lineToRelative(0.0f, -0.0f)
                horizontalLineToRelative(171.53f)
                curveToRelative(11.81f, 0.0f, 21.9f, 8.6f, 23.7f, 20.27f)
                curveToRelative(7.25f, 46.84f, 38.48f, 61.76f, 38.31f, 123.73f)
                curveToRelative(-0.01f, 2.72f, 0.19f, 13.25f, 0.19f, 16.0f)
                curveToRelative(0.0f, 50.65f, -22.12f, 81.57f, -71.26f, 72.6f)
                curveToRelative(-9.3f, 18.6f, -39.49f, 30.74f, -62.31f, 16.45f)
                curveToRelative(-21.18f, 24.65f, -53.9f, 22.64f, -70.94f, 6.3f)
                lineTo(179.48f, 467.2f)
                curveToRelative(0.0f, 24.15f, -20.2f, 44.8f, -43.83f, 44.8f)
                curveToRelative(-23.28f, 0.0f, -43.83f, -21.35f, -43.83f, -44.8f)
                close()
                moveTo(112.0f, 72.0f)
                lineTo(112.0f, 24.0f)
                curveToRelative(0.0f, -13.26f, 10.74f, -24.0f, 24.0f, -24.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, 10.74f, 24.0f, 24.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 13.26f, -10.74f, 24.0f, -24.0f, 24.0f)
                lineTo(136.0f, 96.0f)
                curveToRelative(-13.26f, 0.0f, -24.0f, -10.74f, -24.0f, -24.0f)
                close()
                moveTo(324.0f, 48.0f)
                curveToRelative(0.0f, -11.05f, -8.95f, -20.0f, -20.0f, -20.0f)
                reflectiveCurveToRelative(-20.0f, 8.95f, -20.0f, 20.0f)
                reflectiveCurveToRelative(8.95f, 20.0f, 20.0f, 20.0f)
                reflectiveCurveToRelative(20.0f, -8.95f, 20.0f, -20.0f)
                close()
            }
        }
        .build()
        return _handPointDown!!
    }

private var _handPointDown: ImageVector? = null
