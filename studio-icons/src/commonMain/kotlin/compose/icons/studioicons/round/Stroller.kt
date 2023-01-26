package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Stroller: ImageVector
    get() {
        if (_stroller != null) {
            return _stroller!!
        }
        _stroller = Builder(name = "Stroller", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 20.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                reflectiveCurveTo(18.0f, 18.9f, 18.0f, 20.0f)
                close()
                moveTo(6.0f, 18.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveTo(7.1f, 18.0f, 6.0f, 18.0f)
                close()
                moveTo(14.3f, 4.1f)
                curveTo(13.03f, 3.4f, 11.56f, 3.0f, 10.0f, 3.0f)
                curveTo(8.49f, 3.0f, 7.07f, 3.38f, 5.83f, 4.03f)
                curveTo(5.24f, 4.34f, 5.15f, 5.15f, 5.61f, 5.61f)
                lineToRelative(3.99f, 3.99f)
                lineTo(14.3f, 4.1f)
                close()
                moveTo(21.94f, 5.83f)
                curveTo(21.65f, 4.22f, 20.3f, 3.0f, 18.65f, 3.0f)
                curveToRelative(-1.66f, 0.0f, -2.54f, 1.27f, -3.18f, 2.03f)
                lineTo(6.71f, 15.31f)
                curveToRelative(-0.55f, 0.65f, -0.09f, 1.65f, 0.76f, 1.65f)
                horizontalLineTo(15.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(6.27f)
                curveTo(17.58f, 5.59f, 17.97f, 5.0f, 18.65f, 5.0f)
                curveToRelative(0.68f, 0.0f, 1.22f, 0.52f, 1.33f, 1.21f)
                lineToRelative(0.0f, 0.0f)
                curveTo(20.08f, 6.66f, 20.48f, 7.0f, 20.96f, 7.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                curveTo(21.96f, 5.94f, 21.95f, 5.89f, 21.94f, 5.83f)
                lineTo(21.94f, 5.83f)
                close()
            }
        }
        .build()
        return _stroller!!
    }

private var _stroller: ImageVector? = null
