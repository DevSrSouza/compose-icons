package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Hiking: ImageVector
    get() {
        if (_hiking != null) {
            return _hiking!!
        }
        _hiking = Builder(name = "Hiking", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.95f, 472.23f)
                curveToRelative(-4.28f, 17.16f, 6.14f, 34.53f, 23.28f, 38.81f)
                curveToRelative(2.61f, 0.66f, 5.22f, 0.95f, 7.8f, 0.95f)
                curveToRelative(14.33f, 0.0f, 27.37f, -9.7f, 31.02f, -24.23f)
                lineToRelative(25.24f, -100.97f)
                lineToRelative(-52.78f, -52.78f)
                lineToRelative(-34.56f, 138.22f)
                close()
                moveTo(95.84f, 276.11f)
                lineTo(137.0f, 117.0f)
                curveToRelative(2.19f, -8.42f, -3.14f, -16.95f, -11.92f, -19.06f)
                curveToRelative(-43.88f, -10.52f, -88.35f, 15.07f, -99.32f, 57.17f)
                lineTo(0.49f, 253.24f)
                curveToRelative(-2.19f, 8.42f, 3.14f, 16.95f, 11.92f, 19.06f)
                lineToRelative(63.56f, 15.25f)
                curveToRelative(8.79f, 2.1f, 17.68f, -3.02f, 19.87f, -11.44f)
                close()
                moveTo(368.0f, 160.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-34.75f)
                lineToRelative(-46.78f, -46.78f)
                curveTo(243.38f, 134.11f, 228.61f, 128.0f, 212.91f, 128.0f)
                curveToRelative(-27.02f, 0.0f, -50.47f, 18.3f, -57.03f, 44.52f)
                lineToRelative(-26.92f, 107.72f)
                arcToRelative(32.012f, 32.012f, 0.0f, false, false, 8.42f, 30.39f)
                lineTo(224.0f, 397.25f)
                lineTo(224.0f, 480.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.33f, 32.0f, -32.0f)
                verticalLineToRelative(-82.75f)
                curveToRelative(0.0f, -17.09f, -6.66f, -33.16f, -18.75f, -45.25f)
                lineToRelative(-46.82f, -46.82f)
                curveToRelative(0.15f, -0.5f, 0.49f, -0.89f, 0.62f, -1.41f)
                lineToRelative(19.89f, -79.57f)
                lineToRelative(22.43f, 22.43f)
                curveToRelative(6.0f, 6.0f, 14.14f, 9.38f, 22.62f, 9.38f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(240.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                lineTo(383.99f, 176.0f)
                curveToRelative(0.01f, -8.84f, -7.15f, -16.0f, -15.99f, -16.0f)
                close()
                moveTo(240.0f, 96.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                reflectiveCurveTo(266.51f, 0.0f, 240.0f, 0.0f)
                reflectiveCurveToRelative(-48.0f, 21.49f, -48.0f, 48.0f)
                reflectiveCurveToRelative(21.49f, 48.0f, 48.0f, 48.0f)
                close()
            }
        }
        .build()
        return _hiking!!
    }

private var _hiking: ImageVector? = null
