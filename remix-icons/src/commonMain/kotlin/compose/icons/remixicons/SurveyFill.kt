package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.SurveyFill: ImageVector
    get() {
        if (_surveyFill != null) {
            return _surveyFill!!
        }
        _surveyFill = Builder(name = "SurveyFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 4.0f)
                horizontalLineToRelative(2.007f)
                curveToRelative(0.548f, 0.0f, 0.993f, 0.445f, 0.993f, 0.993f)
                verticalLineToRelative(16.014f)
                curveToRelative(0.0f, 0.548f, -0.445f, 0.993f, -0.993f, 0.993f)
                lineTo(3.993f, 22.0f)
                curveTo(3.445f, 22.0f, 3.0f, 21.555f, 3.0f, 21.007f)
                lineTo(3.0f, 4.993f)
                curveTo(3.0f, 4.445f, 3.445f, 4.0f, 3.993f, 4.0f)
                lineTo(6.0f, 4.0f)
                close()
                moveTo(9.0f, 17.0f)
                lineTo(7.0f, 17.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(9.0f, 14.0f)
                lineTo(7.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(9.0f, 11.0f)
                lineTo(7.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(16.0f, 2.0f)
                verticalLineToRelative(4.0f)
                lineTo(8.0f, 6.0f)
                lineTo(8.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _surveyFill!!
    }

private var _surveyFill: ImageVector? = null
