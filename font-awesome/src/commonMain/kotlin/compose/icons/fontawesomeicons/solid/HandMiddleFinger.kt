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

public val SolidGroup.HandMiddleFinger: ImageVector
    get() {
        if (_handMiddleFinger != null) {
            return _handMiddleFinger!!
        }
        _handMiddleFinger = Builder(name = "HandMiddleFinger", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(479.93f, 317.12f)
                arcToRelative(37.33f, 37.33f, 0.0f, false, false, -28.28f, -36.19f)
                lineTo(416.0f, 272.0f)
                verticalLineToRelative(-49.59f)
                curveToRelative(0.0f, -11.44f, -9.69f, -21.29f, -23.15f, -23.54f)
                lineToRelative(-38.4f, -6.4f)
                curveTo(336.63f, 189.5f, 320.0f, 200.86f, 320.0f, 216.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(50.0f)
                curveToRelative(0.0f, -26.28f, -20.25f, -49.2f, -46.52f, -50.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 208.0f, 48.0f)
                verticalLineToRelative(200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -15.15f, -16.63f, -26.51f, -34.45f, -23.54f)
                lineToRelative(-30.68f, 5.12f)
                curveToRelative(-18.0f, 3.0f, -30.87f, 16.12f, -30.87f, 31.38f)
                verticalLineTo(376.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineToRelative(-76.0f)
                lineToRelative(-27.36f, 15.0f)
                arcTo(37.34f, 37.34f, 0.0f, false, false, 32.0f, 348.4f)
                verticalLineToRelative(73.47f)
                arcToRelative(37.31f, 37.31f, 0.0f, false, false, 10.93f, 26.39f)
                lineToRelative(30.93f, 30.93f)
                arcTo(112.0f, 112.0f, 0.0f, false, false, 153.05f, 512.0f)
                horizontalLineToRelative(215.0f)
                arcTo(112.0f, 112.0f, 0.0f, false, false, 480.0f, 400.0f)
                close()
            }
        }
        .build()
        return _handMiddleFinger!!
    }

private var _handMiddleFinger: ImageVector? = null
