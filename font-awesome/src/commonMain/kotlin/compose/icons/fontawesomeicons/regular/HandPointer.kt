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

public val RegularGroup.HandPointer: ImageVector
    get() {
        if (_handPointer != null) {
            return _handPointer!!
        }
        _handPointer = Builder(name = "HandPointer", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 288.0f)
                curveTo(199.2f, 288.0f, 192.0f, 295.2f, 192.0f, 304.0f)
                verticalLineToRelative(96.0f)
                curveTo(192.0f, 408.8f, 199.2f, 416.0f, 208.0f, 416.0f)
                reflectiveCurveToRelative(16.0f, -7.164f, 16.0f, -16.0f)
                verticalLineToRelative(-96.0f)
                curveTo(224.0f, 295.2f, 216.8f, 288.0f, 208.0f, 288.0f)
                close()
                moveTo(272.0f, 288.0f)
                curveTo(263.2f, 288.0f, 256.0f, 295.2f, 256.0f, 304.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 8.836f, 7.162f, 16.0f, 15.1f, 16.0f)
                reflectiveCurveTo(288.0f, 408.8f, 288.0f, 400.0f)
                lineToRelative(-0.001f, -96.0f)
                curveTo(287.1f, 295.2f, 280.8f, 288.0f, 272.0f, 288.0f)
                close()
                moveTo(376.9f, 201.2f)
                curveToRelative(-13.74f, -17.12f, -34.8f, -27.45f, -56.92f, -27.45f)
                horizontalLineToRelative(-13.72f)
                curveToRelative(-3.713f, 0.0f, -7.412f, 0.291f, -11.07f, 0.865f)
                curveTo(282.7f, 165.1f, 267.4f, 160.0f, 251.4f, 160.0f)
                horizontalLineToRelative(-11.44f)
                verticalLineTo(72.0f)
                curveToRelative(0.0f, -39.7f, -32.31f, -72.0f, -72.01f, -72.0f)
                curveToRelative(-39.7f, 0.0f, -71.98f, 32.3f, -71.98f, 72.0f)
                verticalLineToRelative(168.5f)
                curveTo(84.85f, 235.1f, 75.19f, 235.4f, 69.83f, 235.4f)
                curveToRelative(-44.35f, 0.0f, -69.83f, 37.23f, -69.83f, 69.85f)
                curveToRelative(0.0f, 14.99f, 4.821f, 29.51f, 13.99f, 41.69f)
                lineToRelative(78.14f, 104.2f)
                curveTo(120.7f, 489.3f, 166.2f, 512.0f, 213.7f, 512.0f)
                horizontalLineToRelative(109.7f)
                curveToRelative(6.309f, 0.0f, 12.83f, -0.957f, 18.14f, -2.645f)
                curveToRelative(28.59f, -5.447f, 53.87f, -19.41f, 73.17f, -40.44f)
                curveTo(436.1f, 446.3f, 448.0f, 416.2f, 448.0f, 384.2f)
                verticalLineTo(274.3f)
                curveTo(448.0f, 234.6f, 416.3f, 202.3f, 376.9f, 201.2f)
                close()
                moveTo(400.0f, 384.2f)
                curveToRelative(0.0f, 19.62f, -7.219f, 38.06f, -20.44f, 52.06f)
                curveToRelative(-12.53f, 13.66f, -29.03f, 22.67f, -49.69f, 26.56f)
                curveTo(327.4f, 463.6f, 325.3f, 464.0f, 323.4f, 464.0f)
                horizontalLineTo(213.7f)
                curveToRelative(-32.56f, 0.0f, -63.65f, -15.55f, -83.18f, -41.59f)
                lineTo(52.36f, 318.2f)
                curveTo(49.52f, 314.4f, 48.02f, 309.8f, 48.02f, 305.2f)
                curveToRelative(0.0f, -16.32f, 14.5f, -21.75f, 21.72f, -21.75f)
                curveToRelative(4.454f, 0.0f, 12.01f, 1.55f, 17.34f, 8.703f)
                lineToRelative(28.12f, 37.5f)
                curveToRelative(3.093f, 4.105f, 7.865f, 6.419f, 12.8f, 6.419f)
                curveToRelative(11.94f, 0.0f, 16.01f, -10.7f, 16.01f, -16.01f)
                verticalLineTo(72.0f)
                curveToRelative(0.0f, -13.23f, 10.78f, -24.0f, 23.1f, -24.0f)
                curveToRelative(13.22f, 0.0f, 24.0f, 10.77f, 24.0f, 24.0f)
                verticalLineToRelative(130.7f)
                curveToRelative(0.0f, 6.938f, 5.451f, 16.01f, 16.03f, 16.01f)
                curveTo(219.5f, 218.7f, 220.1f, 208.0f, 237.7f, 208.0f)
                horizontalLineToRelative(13.72f)
                curveToRelative(21.5f, 0.0f, 18.56f, 19.21f, 34.7f, 19.21f)
                curveToRelative(8.063f, 0.0f, 9.805f, -5.487f, 20.15f, -5.487f)
                horizontalLineToRelative(13.72f)
                curveToRelative(26.96f, 0.0f, 17.37f, 27.43f, 40.77f, 27.43f)
                lineToRelative(14.07f, -0.004f)
                curveToRelative(13.88f, 0.0f, 25.16f, 11.28f, 25.16f, 25.14f)
                verticalLineTo(384.2f)
                close()
                moveTo(336.0f, 288.0f)
                curveTo(327.2f, 288.0f, 320.0f, 295.2f, 320.0f, 304.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 8.836f, 7.164f, 16.0f, 16.0f, 16.0f)
                reflectiveCurveToRelative(16.0f, -7.164f, 16.0f, -16.0f)
                verticalLineToRelative(-96.0f)
                curveTo(352.0f, 295.2f, 344.8f, 288.0f, 336.0f, 288.0f)
                close()
            }
        }
        .build()
        return _handPointer!!
    }

private var _handPointer: ImageVector? = null
