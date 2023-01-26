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

public val OutlineGroup.Phishing: ImageVector
    get() {
        if (_phishing != null) {
            return _phishing!!
        }
        _phishing = Builder(name = "Phishing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 6.18f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.18f)
                curveTo(13.84f, 6.6f, 13.0f, 7.7f, 13.0f, 9.0f)
                reflectiveCurveToRelative(0.84f, 2.4f, 2.0f, 2.82f)
                verticalLineTo(15.0f)
                curveToRelative(0.0f, 2.21f, -1.79f, 4.0f, -4.0f, 4.0f)
                reflectiveCurveToRelative(-4.0f, -1.79f, -4.0f, -4.0f)
                verticalLineToRelative(-1.17f)
                lineToRelative(1.59f, 1.59f)
                lineTo(10.0f, 14.0f)
                lineTo(5.0f, 9.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f)
                reflectiveCurveToRelative(6.0f, -2.69f, 6.0f, -6.0f)
                verticalLineToRelative(-3.18f)
                curveToRelative(1.16f, -0.41f, 2.0f, -1.51f, 2.0f, -2.82f)
                reflectiveCurveTo(18.16f, 6.6f, 17.0f, 6.18f)
                close()
                moveTo(16.0f, 10.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveTo(16.55f, 10.0f, 16.0f, 10.0f)
                close()
            }
        }
        .build()
        return _phishing!!
    }

private var _phishing: ImageVector? = null
