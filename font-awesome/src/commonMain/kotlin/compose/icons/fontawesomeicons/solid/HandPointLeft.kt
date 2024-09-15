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

public val SolidGroup.HandPointLeft: ImageVector
    get() {
        if (_handPointLeft != null) {
            return _handPointLeft!!
        }
        _handPointLeft = Builder(name = "HandPointLeft", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(44.8f, 155.83f)
                horizontalLineToRelative(149.23f)
                curveToRelative(-5.84f, -8.25f, -10.57f, -16.56f, -14.15f, -24.92f)
                curveTo(166.25f, 99.1f, 189.78f, 63.99f, 224.0f, 64.0f)
                curveToRelative(18.62f, 0.01f, 32.2f, 10.9f, 40.0f, 29.09f)
                curveToRelative(12.12f, 28.29f, 78.65f, 64.33f, 107.53f, 77.32f)
                curveToRelative(17.86f, 7.96f, 28.45f, 25.48f, 28.46f, 43.85f)
                lineToRelative(0.0f, 0.0f)
                verticalLineToRelative(171.53f)
                curveToRelative(0.0f, 11.81f, -8.6f, 21.9f, -20.27f, 23.7f)
                curveToRelative(-46.84f, 7.25f, -61.76f, 38.48f, -123.73f, 38.31f)
                curveToRelative(-2.72f, -0.01f, -13.25f, 0.19f, -16.0f, 0.19f)
                curveToRelative(-50.65f, 0.0f, -81.57f, -22.12f, -72.6f, -71.26f)
                curveToRelative(-18.6f, -9.3f, -30.74f, -39.49f, -16.45f, -62.31f)
                curveToRelative(-24.65f, -21.18f, -22.64f, -53.9f, -6.3f, -70.94f)
                lineTo(44.8f, 243.48f)
                curveToRelative(-24.15f, 0.0f, -44.8f, -20.2f, -44.8f, -43.83f)
                curveToRelative(0.0f, -23.28f, 21.35f, -43.83f, 44.8f, -43.83f)
                close()
                moveTo(440.0f, 176.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, 10.74f, 24.0f, 24.0f)
                verticalLineToRelative(192.0f)
                curveToRelative(0.0f, 13.26f, -10.74f, 24.0f, -24.0f, 24.0f)
                horizontalLineToRelative(-48.0f)
                curveToRelative(-13.26f, 0.0f, -24.0f, -10.74f, -24.0f, -24.0f)
                lineTo(416.0f, 200.0f)
                curveToRelative(0.0f, -13.26f, 10.74f, -24.0f, 24.0f, -24.0f)
                close()
                moveTo(464.0f, 388.0f)
                curveToRelative(11.05f, 0.0f, 20.0f, -8.95f, 20.0f, -20.0f)
                reflectiveCurveToRelative(-8.95f, -20.0f, -20.0f, -20.0f)
                reflectiveCurveToRelative(-20.0f, 8.95f, -20.0f, 20.0f)
                reflectiveCurveToRelative(8.95f, 20.0f, 20.0f, 20.0f)
                close()
            }
        }
        .build()
        return _handPointLeft!!
    }

private var _handPointLeft: ImageVector? = null
