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

public val RoundGroup.Phishing: ImageVector
    get() {
        if (_phishing != null) {
            return _phishing!!
        }
        _phishing = Builder(name = "Phishing", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 9.0f)
                curveToRelative(0.0f, -1.3f, -0.84f, -2.4f, -2.0f, -2.82f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(3.18f)
                curveTo(13.84f, 6.6f, 13.0f, 7.7f, 13.0f, 9.0f)
                reflectiveCurveToRelative(0.84f, 2.4f, 2.0f, 2.82f)
                lineToRelative(0.0f, 3.01f)
                curveToRelative(0.0f, 2.09f, -1.52f, 3.96f, -3.6f, 4.16f)
                curveTo(9.02f, 19.21f, 7.0f, 17.34f, 7.0f, 15.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.79f)
                curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f)
                lineTo(5.85f, 9.85f)
                curveTo(5.54f, 9.54f, 5.0f, 9.76f, 5.0f, 10.21f)
                lineToRelative(0.0f, 4.58f)
                curveToRelative(0.0f, 3.05f, 2.19f, 5.77f, 5.21f, 6.16f)
                curveTo(13.87f, 21.42f, 17.0f, 18.57f, 17.0f, 15.0f)
                verticalLineToRelative(-3.18f)
                curveTo(18.16f, 11.4f, 19.0f, 10.3f, 19.0f, 9.0f)
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
