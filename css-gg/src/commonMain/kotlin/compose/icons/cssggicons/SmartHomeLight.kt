package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import compose.icons.CssGgIcons

public val CssGgIcons.SmartHomeLight: ImageVector
    get() {
        if (_smartHomeLight != null) {
            return _smartHomeLight!!
        }
        _smartHomeLight = Builder(name = "SmartHomeLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.0343f, 6.5f)
                curveTo(7.0343f, 3.7386f, 9.2729f, 1.5f, 12.0344f, 1.5f)
                curveTo(14.7958f, 1.5f, 17.0344f, 3.7386f, 17.0344f, 6.5f)
                verticalLineTo(10.5f)
                curveTo(17.0344f, 13.2614f, 14.7958f, 15.5f, 12.0344f, 15.5f)
                curveTo(9.2729f, 15.5f, 7.0343f, 13.2614f, 7.0343f, 10.5f)
                verticalLineTo(6.5f)
                close()
                moveTo(15.0344f, 6.5f)
                verticalLineTo(10.5f)
                curveTo(15.0344f, 12.1569f, 13.6912f, 13.5f, 12.0344f, 13.5f)
                curveTo(10.3775f, 13.5f, 9.0344f, 12.1569f, 9.0344f, 10.5f)
                verticalLineTo(6.5f)
                curveTo(9.0344f, 4.8432f, 10.3775f, 3.5f, 12.0344f, 3.5f)
                curveTo(13.6912f, 3.5f, 15.0344f, 4.8432f, 15.0344f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0344f, 16.5f)
                curveTo(11.4821f, 16.5f, 11.0344f, 16.9477f, 11.0344f, 17.5f)
                verticalLineTo(21.5f)
                curveTo(11.0344f, 22.0523f, 11.4821f, 22.5f, 12.0344f, 22.5f)
                curveTo(12.5866f, 22.5f, 13.0344f, 22.0523f, 13.0344f, 21.5f)
                verticalLineTo(17.5f)
                curveTo(13.0344f, 16.9477f, 12.5866f, 16.5f, 12.0344f, 16.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.7443f, 16.4397f)
                curveTo(7.9332f, 15.9207f, 8.5071f, 15.6531f, 9.026f, 15.842f)
                curveTo(9.545f, 16.0309f, 9.8126f, 16.6048f, 9.6237f, 17.1237f)
                lineTo(8.2556f, 20.8825f)
                curveTo(8.0667f, 21.4015f, 7.4929f, 21.6691f, 6.9739f, 21.4802f)
                curveTo(6.4549f, 21.2913f, 6.1874f, 20.7174f, 6.3762f, 20.1985f)
                lineTo(7.7443f, 16.4397f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.974f, 15.8421f)
                curveTo(14.4551f, 16.031f, 14.1875f, 16.6048f, 14.3764f, 17.1238f)
                lineTo(15.7445f, 20.8825f)
                curveTo(15.9333f, 21.4015f, 16.5072f, 21.6691f, 17.0262f, 21.4802f)
                curveTo(17.5451f, 21.2913f, 17.8127f, 20.7175f, 17.6238f, 20.1985f)
                lineTo(16.2558f, 16.4397f)
                curveTo(16.0669f, 15.9208f, 15.493f, 15.6532f, 14.974f, 15.8421f)
                close()
            }
        }
        .build()
        return _smartHomeLight!!
    }

private var _smartHomeLight: ImageVector? = null
