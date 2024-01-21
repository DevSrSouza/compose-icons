package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Powerapps: ImageVector
    get() {
        if (_powerapps != null) {
            return _powerapps!!
        }
        _powerapps = Builder(name = "Powerapps", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.012f, 18.027f)
                lineTo(14.261f, 23.21f)
                curveTo(14.072f, 23.417f, 13.803f, 23.535f, 13.523f, 23.535f)
                curveTo(13.242f, 23.535f, 12.974f, 23.417f, 12.784f, 23.21f)
                lineTo(8.636f, 18.685f)
                curveTo(8.286f, 18.304f, 8.286f, 17.712f, 8.636f, 17.332f)
                lineTo(12.902f, 12.677f)
                curveTo(13.251f, 12.296f, 13.251f, 11.704f, 12.902f, 11.323f)
                lineTo(8.636f, 6.668f)
                curveTo(8.286f, 6.288f, 8.286f, 5.696f, 8.636f, 5.315f)
                lineTo(12.784f, 0.79f)
                curveTo(12.974f, 0.583f, 13.242f, 0.465f, 13.523f, 0.465f)
                curveTo(13.803f, 0.465f, 14.072f, 0.583f, 14.261f, 0.79f)
                lineTo(19.012f, 5.973f)
                curveTo(18.598f, 5.977f, 18.203f, 6.153f, 17.924f, 6.459f)
                lineTo(14.084f, 10.647f)
                curveTo(13.387f, 11.409f, 13.387f, 12.591f, 14.084f, 13.353f)
                lineTo(17.924f, 17.541f)
                curveTo(18.217f, 17.861f, 18.614f, 18.023f, 19.012f, 18.027f)
                close()
                moveTo(11.399f, 22.438f)
                lineTo(10.772f, 23.154f)
                curveTo(10.582f, 23.372f, 10.307f, 23.496f, 10.018f, 23.496f)
                curveTo(9.73f, 23.496f, 9.455f, 23.372f, 9.265f, 23.154f)
                lineTo(0.371f, 12.989f)
                curveTo(-0.124f, 12.426f, -0.124f, 11.574f, 0.371f, 11.011f)
                lineTo(9.265f, 0.846f)
                curveTo(9.455f, 0.628f, 9.73f, 0.504f, 10.018f, 0.504f)
                curveTo(10.307f, 0.504f, 10.582f, 0.628f, 10.772f, 0.846f)
                lineTo(11.399f, 1.562f)
                lineTo(8.268f, 4.978f)
                curveTo(7.743f, 5.548f, 7.743f, 6.436f, 8.268f, 7.006f)
                lineTo(12.534f, 11.661f)
                curveTo(12.708f, 11.852f, 12.708f, 12.148f, 12.534f, 12.339f)
                lineTo(8.268f, 16.994f)
                curveTo(7.743f, 17.564f, 7.743f, 18.452f, 8.268f, 19.022f)
                lineTo(11.399f, 22.438f)
                close()
                moveTo(19.756f, 17.216f)
                curveTo(19.567f, 17.414f, 19.304f, 17.527f, 19.03f, 17.527f)
                curveTo(18.749f, 17.527f, 18.482f, 17.409f, 18.292f, 17.203f)
                lineTo(14.453f, 13.015f)
                curveTo(13.93f, 12.444f, 13.93f, 11.556f, 14.453f, 10.985f)
                lineTo(18.292f, 6.797f)
                curveTo(18.482f, 6.591f, 18.749f, 6.473f, 19.03f, 6.473f)
                curveTo(19.304f, 6.473f, 19.567f, 6.586f, 19.756f, 6.784f)
                lineTo(23.606f, 10.985f)
                curveTo(24.131f, 11.556f, 24.131f, 12.444f, 23.606f, 13.015f)
                lineTo(19.756f, 17.216f)
                close()
            }
        }
        .build()
        return _powerapps!!
    }

private var _powerapps: ImageVector? = null
