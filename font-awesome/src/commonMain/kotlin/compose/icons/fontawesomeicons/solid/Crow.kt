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

public val SolidGroup.Crow: ImageVector
    get() {
        if (_crow != null) {
            return _crow!!
        }
        _crow = Builder(name = "Crow", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(544.0f, 32.0f)
                horizontalLineToRelative(-16.36f)
                curveTo(513.04f, 12.68f, 490.09f, 0.0f, 464.0f, 0.0f)
                curveToRelative(-44.18f, 0.0f, -80.0f, 35.82f, -80.0f, 80.0f)
                verticalLineToRelative(20.98f)
                lineTo(12.09f, 393.57f)
                arcTo(30.22f, 30.22f, 0.0f, false, false, 0.0f, 417.74f)
                curveToRelative(0.0f, 22.46f, 23.64f, 37.07f, 43.73f, 27.03f)
                lineTo(165.27f, 384.0f)
                horizontalLineToRelative(96.49f)
                lineToRelative(44.41f, 120.1f)
                curveToRelative(2.27f, 6.23f, 9.15f, 9.44f, 15.38f, 7.17f)
                lineToRelative(22.55f, -8.21f)
                curveToRelative(6.23f, -2.27f, 9.44f, -9.15f, 7.17f, -15.38f)
                lineTo(312.94f, 384.0f)
                lineTo(352.0f, 384.0f)
                curveToRelative(1.91f, 0.0f, 3.76f, -0.23f, 5.66f, -0.29f)
                lineToRelative(44.51f, 120.38f)
                curveToRelative(2.27f, 6.23f, 9.15f, 9.44f, 15.38f, 7.17f)
                lineToRelative(22.55f, -8.21f)
                curveToRelative(6.23f, -2.27f, 9.44f, -9.15f, 7.17f, -15.38f)
                lineToRelative(-41.24f, -111.53f)
                curveTo(485.74f, 352.8f, 544.0f, 279.26f, 544.0f, 192.0f)
                verticalLineToRelative(-80.0f)
                lineToRelative(96.0f, -16.0f)
                curveToRelative(0.0f, -35.35f, -42.98f, -64.0f, -96.0f, -64.0f)
                close()
                moveTo(464.0f, 104.0f)
                curveToRelative(-13.25f, 0.0f, -24.0f, -10.75f, -24.0f, -24.0f)
                curveToRelative(0.0f, -13.26f, 10.75f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.74f, 24.0f, 24.0f)
                curveToRelative(0.0f, 13.25f, -10.75f, 24.0f, -24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _crow!!
    }

private var _crow: ImageVector? = null
