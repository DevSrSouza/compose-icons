package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Icecream: ImageVector
    get() {
        if (_icecream != null) {
            return _icecream!!
        }
        _icecream = Builder(name = "Icecream", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.79f, 12.4f)
                lineToRelative(3.26f, 6.22f)
                lineToRelative(3.17f, -6.21f)
                curveToRelative(-0.11f, -0.08f, -0.21f, -0.16f, -0.3f, -0.25f)
                curveTo(14.08f, 12.69f, 13.07f, 13.0f, 12.0f, 13.0f)
                reflectiveCurveToRelative(-2.08f, -0.31f, -2.92f, -0.84f)
                curveTo(8.99f, 12.25f, 8.89f, 12.33f, 8.79f, 12.4f)
                close()
                moveTo(6.83f, 12.99f)
                curveTo(5.25f, 12.9f, 4.0f, 11.6f, 4.0f, 10.0f)
                curveToRelative(0.0f, -1.49f, 1.09f, -2.73f, 2.52f, -2.96f)
                curveTo(6.75f, 4.22f, 9.12f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(5.25f, 2.22f, 5.48f, 5.04f)
                curveTo(18.91f, 7.27f, 20.0f, 8.51f, 20.0f, 10.0f)
                curveToRelative(0.0f, 1.59f, -1.24f, 2.9f, -2.81f, 2.99f)
                lineTo(12.07f, 23.0f)
                lineTo(6.83f, 12.99f)
                close()
            }
        }
        .build()
        return _icecream!!
    }

private var _icecream: ImageVector? = null
