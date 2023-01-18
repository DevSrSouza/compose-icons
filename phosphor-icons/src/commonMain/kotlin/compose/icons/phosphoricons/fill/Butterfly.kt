package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Butterfly: ImageVector
    get() {
        if (_butterfly != null) {
            return _butterfly!!
        }
        _butterfly = Builder(name = "Butterfly", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 87.5f)
                verticalLineTo(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineTo(87.5f)
                arcToRelative(98.7f, 98.7f, 0.0f, false, true, 8.0f, 12.7f)
                arcTo(98.7f, 98.7f, 0.0f, false, true, 136.0f, 87.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.4f, 50.4f)
                curveTo(227.7f, 45.6f, 220.7f, 40.0f, 208.0f, 40.0f)
                curveToRelative(-16.7f, 0.0f, -38.1f, 11.3f, -57.2f, 30.3f)
                arcTo(144.2f, 144.2f, 0.0f, false, false, 136.0f, 87.5f)
                verticalLineTo(172.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(87.5f)
                arcToRelative(144.2f, 144.2f, 0.0f, false, false, -14.8f, -17.2f)
                curveTo(86.1f, 51.3f, 64.7f, 40.0f, 48.0f, 40.0f)
                curveToRelative(-12.7f, 0.0f, -19.7f, 5.6f, -23.4f, 10.4f)
                curveToRelative(-6.8f, 8.7f, -12.2f, 24.1f, -0.4f, 71.5f)
                curveToRelative(6.6f, 26.3f, 22.0f, 34.9f, 33.5f, 37.5f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 70.3f, 38.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 70.3f, -38.0f)
                curveToRelative(11.5f, -2.6f, 26.9f, -11.2f, 33.5f, -37.5f)
                reflectiveCurveTo(243.6f, 66.0f, 231.4f, 50.4f)
                close()
            }
        }
        .build()
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
