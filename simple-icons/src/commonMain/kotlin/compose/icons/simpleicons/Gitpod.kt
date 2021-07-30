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

public val SimpleIcons.Gitpod: ImageVector
    get() {
        if (_gitpod != null) {
            return _gitpod!!
        }
        _gitpod = Builder(name = "Gitpod", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.982f, 8.309f)
                lineTo(12.0f, 11.783f)
                lineToRelative(6.023f, -3.476f)
                lineToRelative(-6.022f, -3.47f)
                close()
                moveTo(11.749f, 12.22f)
                lineTo(5.727f, 8.743f)
                verticalLineToRelative(6.954f)
                lineToRelative(6.022f, 3.45f)
                close()
                moveTo(3.875f, 7.092f)
                lineTo(12.0f, 2.405f)
                lineToRelative(8.131f, 4.685f)
                lineToRelative(2.074f, -1.196f)
                lineTo(12.0f, 0.0f)
                lineTo(1.796f, 5.892f)
                close()
                moveTo(11.749f, 21.573f)
                lineTo(3.62f, 16.917f)
                verticalLineToRelative(-9.39f)
                lineTo(1.545f, 6.329f)
                verticalLineToRelative(11.78f)
                lineTo(11.75f, 24.0f)
                close()
                moveTo(12.252f, 12.22f)
                verticalLineToRelative(6.926f)
                lineToRelative(6.028f, -3.45f)
                verticalLineToRelative(-2.397f)
                lineToRelative(-4.214f, 2.398f)
                verticalLineToRelative(-2.423f)
                lineToRelative(6.32f, -3.597f)
                verticalLineToRelative(7.24f)
                lineToRelative(-8.134f, 4.656f)
                lineTo(12.252f, 24.0f)
                lineToRelative(10.203f, -5.89f)
                lineTo(22.455f, 6.33f)
                close()
            }
        }
        .build()
        return _gitpod!!
    }

private var _gitpod: ImageVector? = null
