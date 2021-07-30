package compose.icons.evaicons.fill

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
import compose.icons.evaicons.FillGroup

public val FillGroup.Github: ImageVector
    get() {
        if (_github != null) {
            return _github!!
        }
        _github = Builder(name = "Github", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.0f, strokeAlpha
                    = 0.0f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(24.0f, 24.0f)
                lineToRelative(-24.0f, -0.0f)
                lineToRelative(-0.0f, -24.0f)
                lineToRelative(24.0f, -0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF231f20)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                arcTo(10.89f, 10.89f, 0.0f, false, false, 1.0f, 11.77f)
                arcTo(10.79f, 10.79f, 0.0f, false, false, 8.52f, 22.0f)
                curveToRelative(0.55f, 0.1f, 0.75f, -0.23f, 0.75f, -0.52f)
                reflectiveCurveToRelative(0.0f, -0.93f, 0.0f, -1.83f)
                curveToRelative(-3.06f, 0.65f, -3.71f, -1.44f, -3.71f, -1.44f)
                arcToRelative(2.86f, 2.86f, 0.0f, false, false, -1.22f, -1.58f)
                curveToRelative(-1.0f, -0.66f, 0.08f, -0.65f, 0.08f, -0.65f)
                arcToRelative(2.31f, 2.31f, 0.0f, false, true, 1.68f, 1.11f)
                arcToRelative(2.37f, 2.37f, 0.0f, false, false, 3.2f, 0.89f)
                arcToRelative(2.33f, 2.33f, 0.0f, false, true, 0.7f, -1.44f)
                curveToRelative(-2.44f, -0.27f, -5.0f, -1.19f, -5.0f, -5.32f)
                arcTo(4.15f, 4.15f, 0.0f, false, true, 6.11f, 8.31f)
                arcToRelative(3.78f, 3.78f, 0.0f, false, true, 0.11f, -2.84f)
                reflectiveCurveToRelative(0.93f, -0.29f, 3.0f, 1.1f)
                arcToRelative(10.68f, 10.68f, 0.0f, false, true, 5.5f, 0.0f)
                curveToRelative(2.1f, -1.39f, 3.0f, -1.1f, 3.0f, -1.1f)
                arcToRelative(3.78f, 3.78f, 0.0f, false, true, 0.11f, 2.84f)
                arcTo(4.15f, 4.15f, 0.0f, false, true, 19.0f, 11.2f)
                curveToRelative(0.0f, 4.14f, -2.58f, 5.05f, -5.0f, 5.32f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.75f, 2.0f)
                curveToRelative(0.0f, 1.44f, 0.0f, 2.6f, 0.0f, 2.95f)
                reflectiveCurveToRelative(0.2f, 0.63f, 0.75f, 0.52f)
                arcTo(10.8f, 10.8f, 0.0f, false, false, 23.0f, 11.77f)
                arcTo(10.89f, 10.89f, 0.0f, false, false, 12.0f, 1.0f)
            }
        }
        .build()
        return _github!!
    }

private var _github: ImageVector? = null
