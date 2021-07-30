package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Kickstarter: ImageVector
    get() {
        if (_kickstarter != null) {
            return _kickstarter!!
        }
        _kickstarter = Builder(name = "Kickstarter", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 480.0f)
                horizontalLineTo(48.0f)
                curveToRelative(-26.4f, 0.0f, -48.0f, -21.6f, -48.0f, -48.0f)
                verticalLineTo(80.0f)
                curveToRelative(0.0f, -26.4f, 21.6f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.4f, 0.0f, 48.0f, 21.6f, 48.0f, 48.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.4f, -21.6f, 48.0f, -48.0f, 48.0f)
                close()
                moveTo(199.6f, 178.5f)
                curveToRelative(0.0f, -30.7f, -17.6f, -45.1f, -39.7f, -45.1f)
                curveToRelative(-25.8f, 0.0f, -40.0f, 19.8f, -40.0f, 44.5f)
                verticalLineToRelative(154.8f)
                curveToRelative(0.0f, 25.8f, 13.7f, 45.6f, 40.5f, 45.6f)
                curveToRelative(21.5f, 0.0f, 39.2f, -14.0f, 39.2f, -45.6f)
                verticalLineToRelative(-41.8f)
                lineToRelative(60.6f, 75.7f)
                curveToRelative(12.3f, 14.9f, 39.0f, 16.8f, 55.8f, 0.0f)
                curveToRelative(14.6f, -15.1f, 14.8f, -36.8f, 4.0f, -50.4f)
                lineToRelative(-49.1f, -62.8f)
                lineToRelative(40.5f, -58.7f)
                curveToRelative(9.4f, -13.5f, 9.5f, -34.5f, -5.6f, -49.1f)
                curveToRelative(-16.4f, -15.9f, -44.6f, -17.3f, -61.4f, 7.0f)
                lineToRelative(-44.8f, 64.7f)
                verticalLineToRelative(-38.8f)
                close()
            }
        }
        .build()
        return _kickstarter!!
    }

private var _kickstarter: ImageVector? = null
