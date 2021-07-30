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

public val RegularGroup.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.174f, 80.0f)
                curveToRelative(-49.132f, 0.0f, -93.305f, -32.0f, -161.913f, -32.0f)
                curveToRelative(-31.301f, 0.0f, -58.303f, 6.482f, -80.721f, 15.168f)
                arcToRelative(48.04f, 48.04f, 0.0f, false, false, 2.142f, -20.727f)
                curveTo(93.067f, 19.575f, 74.167f, 1.594f, 51.201f, 0.104f)
                curveTo(23.242f, -1.71f, 0.0f, 20.431f, 0.0f, 48.0f)
                curveToRelative(0.0f, 17.764f, 9.657f, 33.262f, 24.0f, 41.562f)
                verticalLineTo(496.0f)
                curveToRelative(0.0f, 8.837f, 7.163f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(8.837f, 0.0f, 16.0f, -7.163f, 16.0f, -16.0f)
                verticalLineToRelative(-83.443f)
                curveTo(109.869f, 395.28f, 143.259f, 384.0f, 199.826f, 384.0f)
                curveToRelative(49.132f, 0.0f, 93.305f, 32.0f, 161.913f, 32.0f)
                curveToRelative(58.479f, 0.0f, 101.972f, -22.617f, 128.548f, -39.981f)
                curveTo(503.846f, 367.161f, 512.0f, 352.051f, 512.0f, 335.855f)
                verticalLineTo(95.937f)
                curveToRelative(0.0f, -34.459f, -35.264f, -57.768f, -66.904f, -44.117f)
                curveTo(409.193f, 67.309f, 371.641f, 80.0f, 336.174f, 80.0f)
                close()
                moveTo(464.0f, 336.0f)
                curveToRelative(-21.783f, 15.412f, -60.824f, 32.0f, -102.261f, 32.0f)
                curveToRelative(-59.945f, 0.0f, -102.002f, -32.0f, -161.913f, -32.0f)
                curveToRelative(-43.361f, 0.0f, -96.379f, 9.403f, -127.826f, 24.0f)
                verticalLineTo(128.0f)
                curveToRelative(21.784f, -15.412f, 60.824f, -32.0f, 102.261f, -32.0f)
                curveToRelative(59.945f, 0.0f, 102.002f, 32.0f, 161.913f, 32.0f)
                curveToRelative(43.271f, 0.0f, 96.32f, -17.366f, 127.826f, -32.0f)
                verticalLineToRelative(240.0f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
