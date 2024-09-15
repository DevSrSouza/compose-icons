package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.HandLizardSolid: ImageVector
    get() {
        if (_handLizardSolid != null) {
            return _handLizardSolid!!
        }
        _handLizardSolid = Builder(name = "HandLizardSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.313f, 4.0f)
                curveTo(12.535f, 4.0f, 10.863f, 4.934f, 9.969f, 6.469f)
                lineTo(4.688f, 15.563f)
                curveTo(4.242f, 16.328f, 4.0f, 17.207f, 4.0f, 18.094f)
                lineTo(4.0f, 28.0f)
                lineTo(14.0f, 28.0f)
                lineTo(14.0f, 23.688f)
                curveTo(16.629f, 22.898f, 17.984f, 21.516f, 18.406f, 21.0f)
                lineTo(24.719f, 21.0f)
                curveTo(25.996f, 21.0f, 26.965f, 19.738f, 26.656f, 18.5f)
                lineTo(26.531f, 18.031f)
                curveTo(26.086f, 16.258f, 24.484f, 15.0f, 22.656f, 15.0f)
                lineTo(15.781f, 15.0f)
                lineTo(15.281f, 13.0f)
                lineTo(21.656f, 13.0f)
                curveTo(23.484f, 13.0f, 25.086f, 11.742f, 25.531f, 9.969f)
                lineTo(25.875f, 8.656f)
                curveTo(27.055f, 8.25f, 28.0f, 7.309f, 28.0f, 6.0f)
                lineTo(28.0f, 4.0f)
                close()
                moveTo(14.313f, 6.0f)
                lineTo(26.0f, 6.0f)
                curveTo(26.0f, 6.566f, 25.566f, 7.0f, 25.0f, 7.0f)
                lineTo(16.0f, 7.0f)
                lineTo(15.0f, 9.0f)
                lineTo(23.719f, 9.0f)
                lineTo(23.594f, 9.5f)
                curveTo(23.371f, 10.395f, 22.578f, 11.0f, 21.656f, 11.0f)
                lineTo(15.281f, 11.0f)
                curveTo(14.004f, 11.0f, 13.035f, 12.262f, 13.344f, 13.5f)
                lineTo(13.844f, 15.5f)
                curveTo(14.066f, 16.387f, 14.867f, 17.0f, 15.781f, 17.0f)
                lineTo(22.656f, 17.0f)
                curveTo(23.578f, 17.0f, 24.371f, 17.605f, 24.594f, 18.5f)
                lineTo(24.719f, 19.0f)
                lineTo(17.5f, 19.0f)
                lineTo(17.188f, 19.406f)
                curveTo(17.188f, 19.406f, 15.746f, 21.453f, 12.813f, 22.031f)
                lineTo(12.0f, 22.188f)
                lineTo(12.0f, 26.0f)
                lineTo(6.0f, 26.0f)
                lineTo(6.0f, 18.094f)
                curveTo(6.0f, 17.563f, 6.137f, 17.023f, 6.406f, 16.563f)
                lineTo(11.719f, 7.5f)
                curveTo(12.258f, 6.578f, 13.242f, 6.0f, 14.313f, 6.0f)
                close()
            }
        }
        .build()
        return _handLizardSolid!!
    }

private var _handLizardSolid: ImageVector? = null
