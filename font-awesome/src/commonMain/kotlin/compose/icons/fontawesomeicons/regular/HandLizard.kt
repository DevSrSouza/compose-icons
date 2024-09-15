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

public val RegularGroup.HandLizard: ImageVector
    get() {
        if (_handLizard != null) {
            return _handLizard!!
        }
        _handLizard = Builder(name = "HandLizard", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(556.69f, 290.54f)
                lineTo(410.33f, 64.83f)
                curveTo(397.0f, 44.27f, 374.42f, 32.0f, 349.92f, 32.0f)
                horizontalLineTo(56.0f)
                curveTo(25.12f, 32.0f, 0.0f, 57.12f, 0.0f, 88.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 44.11f, 35.89f, 80.0f, 80.0f, 80.0f)
                horizontalLineToRelative(196.04f)
                lineToRelative(-18.33f, 48.0f)
                horizontalLineTo(144.0f)
                curveToRelative(-48.52f, 0.0f, -88.0f, 39.48f, -88.0f, 88.0f)
                curveToRelative(0.0f, 30.88f, 25.12f, 56.0f, 56.0f, 56.0f)
                horizontalLineToRelative(131.55f)
                curveToRelative(2.99f, 0.0f, 5.91f, 0.55f, 8.7f, 1.63f)
                lineTo(352.0f, 408.42f)
                verticalLineTo(480.0f)
                horizontalLineToRelative(224.0f)
                verticalLineTo(355.83f)
                curveToRelative(0.0f, -23.23f, -6.68f, -45.8f, -19.31f, -65.29f)
                close()
                moveTo(528.0f, 432.0f)
                horizontalLineTo(400.0f)
                verticalLineToRelative(-23.58f)
                curveToRelative(0.0f, -19.95f, -12.01f, -37.51f, -30.6f, -44.74f)
                lineToRelative(-99.75f, -38.79f)
                arcTo(71.73f, 71.73f, 0.0f, false, false, 243.55f, 320.0f)
                horizontalLineTo(112.0f)
                curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f)
                curveToRelative(0.0f, -22.06f, 17.94f, -40.0f, 40.0f, -40.0f)
                horizontalLineToRelative(113.71f)
                curveToRelative(19.77f, 0.0f, 37.79f, -12.41f, 44.84f, -30.87f)
                lineToRelative(24.55f, -64.28f)
                curveToRelative(9.0f, -23.55f, -8.43f, -48.85f, -33.63f, -48.85f)
                horizontalLineTo(80.0f)
                curveToRelative(-17.65f, 0.0f, -32.0f, -14.35f, -32.0f, -32.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0.0f, -4.41f, 3.59f, -8.0f, 8.0f, -8.0f)
                horizontalLineToRelative(293.92f)
                curveToRelative(8.17f, 0.0f, 15.69f, 4.09f, 20.14f, 10.94f)
                lineToRelative(146.36f, 225.71f)
                arcTo(71.84f, 71.84f, 0.0f, false, true, 528.0f, 355.83f)
                verticalLineTo(432.0f)
                close()
            }
        }
        .build()
        return _handLizard!!
    }

private var _handLizard: ImageVector? = null
