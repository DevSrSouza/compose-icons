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

public val RegularGroup.HandScissors: ImageVector
    get() {
        if (_handScissors != null) {
            return _handScissors!!
        }
        _handScissors = Builder(name = "HandScissors", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 480.0f)
                lineToRelative(70.0f, -0.013f)
                curveToRelative(5.114f, 0.0f, 10.231f, -0.583f, 15.203f, -1.729f)
                lineToRelative(118.999f, -27.427f)
                curveTo(490.56f, 443.835f, 512.0f, 417.02f, 512.0f, 386.277f)
                lineTo(512.0f, 180.575f)
                curveToRelative(0.0f, -23.845f, -13.03f, -45.951f, -34.005f, -57.69f)
                lineToRelative(-97.999f, -54.853f)
                curveToRelative(-34.409f, -19.261f, -67.263f, -5.824f, -92.218f, 24.733f)
                lineTo(142.85f, 37.008f)
                curveToRelative(-37.887f, -14.579f, -80.612f, 3.727f, -95.642f, 41.201f)
                curveToRelative(-15.098f, 37.642f, 3.635f, 80.37f, 41.942f, 95.112f)
                lineTo(168.0f, 192.0f)
                lineToRelative(-94.0f, -9.141f)
                curveToRelative(-40.804f, 0.0f, -74.0f, 32.811f, -74.0f, 73.14f)
                curveToRelative(0.0f, 40.33f, 33.196f, 73.141f, 74.0f, 73.141f)
                horizontalLineToRelative(87.635f)
                curveToRelative(-3.675f, 26.245f, 8.692f, 51.297f, 30.341f, 65.006f)
                curveTo(178.657f, 436.737f, 211.044f, 480.0f, 256.0f, 480.0f)
                close()
                moveTo(256.0f, 431.987f)
                curveToRelative(-25.16f, 0.0f, -25.12f, -36.567f, 0.0f, -36.567f)
                curveToRelative(8.837f, 0.0f, 16.0f, -7.163f, 16.0f, -16.0f)
                verticalLineToRelative(-6.856f)
                curveToRelative(0.0f, -8.837f, -7.163f, -16.0f, -16.0f, -16.0f)
                horizontalLineToRelative(-28.0f)
                curveToRelative(-25.159f, 0.0f, -25.122f, -36.567f, 0.0f, -36.567f)
                horizontalLineToRelative(28.0f)
                curveToRelative(8.837f, 0.0f, 16.0f, -7.163f, 16.0f, -16.0f)
                verticalLineToRelative(-6.856f)
                curveToRelative(0.0f, -8.837f, -7.163f, -16.0f, -16.0f, -16.0f)
                lineTo(74.0f, 281.141f)
                curveToRelative(-34.43f, 0.0f, -34.375f, -50.281f, 0.0f, -50.281f)
                horizontalLineToRelative(182.0f)
                curveToRelative(8.837f, 0.0f, 16.0f, -7.163f, 16.0f, -16.0f)
                verticalLineToRelative(-11.632f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -10.254f, -14.933f)
                lineTo(106.389f, 128.51f)
                curveToRelative(-31.552f, -12.14f, -13.432f, -59.283f, 19.222f, -46.717f)
                lineToRelative(166.549f, 64.091f)
                arcToRelative(16.001f, 16.001f, 0.0f, false, false, 18.139f, -4.812f)
                lineToRelative(21.764f, -26.647f)
                curveToRelative(5.82f, -7.127f, 16.348f, -9.064f, 24.488f, -4.508f)
                lineToRelative(98.0f, 54.854f)
                curveToRelative(5.828f, 3.263f, 9.449f, 9.318f, 9.449f, 15.805f)
                verticalLineToRelative(205.701f)
                curveToRelative(0.0f, 8.491f, -5.994f, 15.804f, -14.576f, 17.782f)
                lineToRelative(-119.001f, 27.427f)
                arcToRelative(19.743f, 19.743f, 0.0f, false, true, -4.423f, 0.502f)
                horizontalLineToRelative(-70.0f)
                close()
            }
        }
        .build()
        return _handScissors!!
    }

private var _handScissors: ImageVector? = null
