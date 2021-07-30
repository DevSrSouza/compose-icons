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

public val SolidGroup.Dog: ImageVector
    get() {
        if (_dog != null) {
            return _dog!!
        }
        _dog = Builder(name = "Dog", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(298.06f, 224.0f)
                lineTo(448.0f, 277.55f)
                lineTo(448.0f, 496.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(368.0f, 512.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(352.0f, 384.0f)
                lineTo(192.0f, 384.0f)
                lineTo(192.0f, 496.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(112.0f, 512.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(96.0f, 282.09f)
                curveTo(58.84f, 268.84f, 32.0f, 233.66f, 32.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 64.0f, 0.0f)
                arcToRelative(32.06f, 32.06f, 0.0f, false, false, 32.0f, 32.0f)
                close()
                moveTo(544.0f, 112.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, -64.0f, 64.0f)
                lineTo(448.0f, 208.0f)
                verticalLineToRelative(35.58f)
                lineTo(320.0f, 197.87f)
                lineTo(320.0f, 48.0f)
                curveToRelative(0.0f, -14.25f, 17.22f, -21.39f, 27.31f, -11.31f)
                lineTo(374.59f, 64.0f)
                horizontalLineToRelative(53.63f)
                curveToRelative(10.91f, 0.0f, 23.75f, 7.92f, 28.62f, 17.69f)
                lineTo(464.0f, 96.0f)
                horizontalLineToRelative(64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 544.0f, 112.0f)
                close()
                moveTo(432.0f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 432.0f, 112.0f)
                close()
            }
        }
        .build()
        return _dog!!
    }

private var _dog: ImageVector? = null
