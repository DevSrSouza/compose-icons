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

public val OutlineGroup.SpeakerGroup: ImageVector
    get() {
        if (_speakerGroup != null) {
            return _speakerGroup!!
        }
        _speakerGroup = Builder(name = "SpeakerGroup", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.2f, 1.0f)
                lineTo(9.8f, 1.0f)
                curveTo(8.81f, 1.0f, 8.0f, 1.81f, 8.0f, 2.8f)
                verticalLineToRelative(14.4f)
                curveToRelative(0.0f, 0.99f, 0.81f, 1.79f, 1.8f, 1.79f)
                lineToRelative(8.4f, 0.01f)
                curveToRelative(0.99f, 0.0f, 1.8f, -0.81f, 1.8f, -1.8f)
                lineTo(20.0f, 2.8f)
                curveToRelative(0.0f, -0.99f, -0.81f, -1.8f, -1.8f, -1.8f)
                close()
                moveTo(18.0f, 17.0f)
                lineToRelative(-8.0f, -0.01f)
                lineTo(10.0f, 3.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(14.0f)
                close()
                moveTo(14.0f, 8.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.89f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(14.0f, 16.0f)
                curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveTo(15.93f, 9.0f, 14.0f, 9.0f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveTo(12.07f, 16.0f, 14.0f, 16.0f)
                close()
                moveTo(14.0f, 11.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(14.83f, 14.0f, 14.0f, 14.0f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(6.0f, 5.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-2.0f)
                lineTo(6.0f, 21.0f)
                lineTo(6.0f, 5.0f)
                close()
            }
        }
        .build()
        return _speakerGroup!!
    }

private var _speakerGroup: ImageVector? = null
