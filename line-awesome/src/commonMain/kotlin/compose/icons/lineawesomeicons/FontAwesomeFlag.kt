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

public val LineAwesomeIcons.FontAwesomeFlag: ImageVector
    get() {
        if (_fontAwesomeFlag != null) {
            return _fontAwesomeFlag!!
        }
        _fontAwesomeFlag = Builder(name = "FontAwesomeFlag", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                curveTo(7.346f, 4.0f, 6.0f, 5.346f, 6.0f, 7.0f)
                curveTo(6.0f, 8.302f, 6.839f, 9.402f, 8.0f, 9.816f)
                lineTo(8.0f, 11.305f)
                lineTo(8.0f, 23.207f)
                lineTo(8.0f, 27.023f)
                curveTo(8.0f, 27.563f, 8.437f, 28.0f, 8.977f, 28.0f)
                lineTo(9.023f, 28.0f)
                curveTo(9.563f, 28.0f, 10.0f, 27.563f, 10.0f, 27.023f)
                lineTo(10.0f, 22.229f)
                curveTo(10.335f, 21.84f, 11.138f, 21.047f, 13.445f, 21.047f)
                curveTo(14.669f, 21.047f, 15.67f, 21.474f, 16.732f, 21.926f)
                curveTo(17.769f, 22.368f, 18.842f, 22.824f, 20.088f, 22.824f)
                curveTo(22.447f, 22.824f, 24.049f, 21.585f, 24.734f, 21.055f)
                lineTo(24.887f, 20.939f)
                curveTo(25.438f, 20.54f, 26.0f, 19.996f, 26.0f, 19.0f)
                lineTo(26.0f, 10.676f)
                curveTo(26.0f, 9.768f, 25.222f, 9.0f, 24.299f, 9.0f)
                curveTo(23.804f, 9.0f, 23.44f, 9.287f, 22.941f, 9.684f)
                curveTo(22.279f, 10.208f, 21.281f, 11.0f, 20.088f, 11.0f)
                curveTo(19.273f, 11.0f, 18.478f, 10.62f, 17.555f, 10.178f)
                curveTo(16.404f, 9.626f, 15.098f, 9.0f, 13.443f, 9.0f)
                curveTo(12.308f, 9.0f, 11.422f, 9.188f, 10.713f, 9.457f)
                curveTo(11.489f, 8.914f, 12.0f, 8.017f, 12.0f, 7.0f)
                curveTo(12.0f, 5.346f, 10.654f, 4.0f, 9.0f, 4.0f)
                close()
                moveTo(9.0f, 6.0f)
                curveTo(9.552f, 6.0f, 10.0f, 6.449f, 10.0f, 7.0f)
                curveTo(10.0f, 7.551f, 9.552f, 8.0f, 9.0f, 8.0f)
                curveTo(8.448f, 8.0f, 8.0f, 7.551f, 8.0f, 7.0f)
                curveTo(8.0f, 6.449f, 8.448f, 6.0f, 9.0f, 6.0f)
                close()
                moveTo(13.443f, 11.0f)
                curveTo(14.645f, 11.0f, 15.638f, 11.476f, 16.691f, 11.98f)
                curveTo(17.736f, 12.482f, 18.818f, 13.0f, 20.088f, 13.0f)
                curveTo(21.843f, 13.0f, 23.158f, 12.054f, 23.998f, 11.396f)
                lineTo(23.998f, 19.066f)
                curveTo(23.997f, 19.07f, 23.953f, 19.145f, 23.709f, 19.322f)
                lineTo(23.51f, 19.475f)
                curveTo(22.943f, 19.913f, 21.763f, 20.824f, 20.088f, 20.824f)
                curveTo(19.25f, 20.824f, 18.447f, 20.483f, 17.516f, 20.086f)
                curveTo(16.373f, 19.598f, 15.076f, 19.045f, 13.443f, 19.045f)
                curveTo(11.891f, 19.045f, 10.786f, 19.358f, 10.0f, 19.75f)
                lineTo(10.0f, 12.361f)
                curveTo(10.345f, 11.905f, 11.132f, 11.0f, 13.443f, 11.0f)
                close()
            }
        }
        .build()
        return _fontAwesomeFlag!!
    }

private var _fontAwesomeFlag: ImageVector? = null
