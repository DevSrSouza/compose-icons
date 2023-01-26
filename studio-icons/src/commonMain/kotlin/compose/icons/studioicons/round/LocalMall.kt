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

public val RoundGroup.LocalMall: ImageVector
    get() {
        if (_localMall != null) {
            return _localMall!!
        }
        _localMall = Builder(name = "LocalMall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f)
                reflectiveCurveTo(7.0f, 3.24f, 7.0f, 6.0f)
                lineTo(5.0f, 6.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(21.0f, 8.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, 1.34f, 3.0f, 3.0f)
                lineTo(9.0f, 6.0f)
                curveToRelative(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-2.33f, 0.0f, -4.29f, -1.59f, -4.84f, -3.75f)
                curveToRelative(-0.17f, -0.63f, 0.32f, -1.25f, 0.97f, -1.25f)
                curveToRelative(0.47f, 0.0f, 0.85f, 0.34f, 0.98f, 0.8f)
                curveToRelative(0.35f, 1.27f, 1.51f, 2.2f, 2.89f, 2.2f)
                reflectiveCurveToRelative(2.54f, -0.93f, 2.89f, -2.2f)
                curveToRelative(0.13f, -0.46f, 0.51f, -0.8f, 0.98f, -0.8f)
                curveToRelative(0.65f, 0.0f, 1.13f, 0.62f, 0.97f, 1.25f)
                curveTo(16.29f, 11.41f, 14.33f, 13.0f, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _localMall!!
    }

private var _localMall: ImageVector? = null
