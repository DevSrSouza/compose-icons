package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.HowToReg: ImageVector
    get() {
        if (_howToReg != null) {
            return _howToReg!!
        }
        _howToReg = Builder(name = "HowToReg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 12.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f)
                close()
                moveTo(11.0f, 6.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                close()
                moveTo(5.0f, 18.0f)
                curveToRelative(0.2f, -0.63f, 2.57f, -1.68f, 4.96f, -1.94f)
                lineToRelative(2.04f, -2.0f)
                curveToRelative(-0.39f, -0.04f, -0.68f, -0.06f, -1.0f, -0.06f)
                curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(9.0f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(5.0f, 18.0f)
                close()
                moveTo(20.6f, 12.5f)
                lineToRelative(-5.13f, 5.17f)
                lineToRelative(-2.07f, -2.08f)
                lineTo(12.0f, 17.0f)
                lineToRelative(3.47f, 3.5f)
                lineTo(22.0f, 13.91f)
                close()
            }
        }
        .build()
        return _howToReg!!
    }

private var _howToReg: ImageVector? = null
