package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.FireExtinguisherSolid: ImageVector
    get() {
        if (_fireExtinguisherSolid != null) {
            return _fireExtinguisherSolid!!
        }
        _fireExtinguisherSolid = Builder(name = "FireExtinguisherSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(14.707f, 4.0f, 13.605f, 4.844f, 13.188f, 6.0f)
                lineTo(12.0f, 6.0f)
                curveTo(9.254f, 6.0f, 7.0f, 8.254f, 7.0f, 11.0f)
                lineTo(9.0f, 11.0f)
                curveTo(9.0f, 9.344f, 10.344f, 8.0f, 12.0f, 8.0f)
                lineTo(13.0f, 8.0f)
                lineTo(13.0f, 10.469f)
                curveTo(12.68f, 10.707f, 12.266f, 11.047f, 11.781f, 11.531f)
                curveTo(10.953f, 12.359f, 10.0f, 13.5f, 10.0f, 15.0f)
                lineTo(10.0f, 28.0f)
                lineTo(22.0f, 28.0f)
                lineTo(22.0f, 15.0f)
                curveTo(22.0f, 13.5f, 21.047f, 12.359f, 20.219f, 11.531f)
                curveTo(19.734f, 11.047f, 19.32f, 10.707f, 19.0f, 10.469f)
                lineTo(19.0f, 10.188f)
                lineTo(23.844f, 11.0f)
                lineTo(25.0f, 11.188f)
                lineTo(25.0f, 4.813f)
                lineTo(23.844f, 5.0f)
                lineTo(18.75f, 5.844f)
                curveTo(18.293f, 4.77f, 17.234f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(16.555f, 6.0f, 17.0f, 6.445f, 17.0f, 7.0f)
                lineTo(17.0f, 10.0f)
                lineTo(15.0f, 10.0f)
                lineTo(15.0f, 7.0f)
                curveTo(15.0f, 6.445f, 15.445f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(23.0f, 7.188f)
                lineTo(23.0f, 8.813f)
                lineTo(19.0f, 8.125f)
                lineTo(19.0f, 7.875f)
                close()
                moveTo(14.375f, 12.0f)
                lineTo(17.625f, 12.0f)
                curveTo(17.777f, 12.105f, 18.203f, 12.391f, 18.781f, 12.969f)
                curveTo(19.453f, 13.641f, 20.0f, 14.5f, 20.0f, 15.0f)
                lineTo(20.0f, 26.0f)
                lineTo(12.0f, 26.0f)
                lineTo(12.0f, 15.0f)
                curveTo(12.0f, 14.5f, 12.547f, 13.641f, 13.219f, 12.969f)
                curveTo(13.797f, 12.391f, 14.223f, 12.105f, 14.375f, 12.0f)
                close()
                moveTo(14.0f, 17.0f)
                lineTo(14.0f, 19.0f)
                lineTo(18.0f, 19.0f)
                lineTo(18.0f, 17.0f)
                close()
            }
        }
        .build()
        return _fireExtinguisherSolid!!
    }

private var _fireExtinguisherSolid: ImageVector? = null
