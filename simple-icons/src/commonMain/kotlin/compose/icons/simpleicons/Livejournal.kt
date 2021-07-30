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

public val SimpleIcons.Livejournal: ImageVector
    get() {
        if (_livejournal != null) {
            return _livejournal!!
        }
        _livejournal = Builder(name = "Livejournal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.09f, 14.696f)
                curveToRelative(-1.512f, 0.664f, -2.726f, 1.885f, -3.381f, 3.399f)
                lineToRelative(4.27f, 0.883f)
                lineToRelative(-0.886f, -4.282f)
                horizontalLineToRelative(-0.003f)
                close()
                moveTo(2.475f, 8.317f)
                lineTo(0.0f, 5.85f)
                curveTo(1.125f, 3.237f, 3.216f, 1.14f, 5.823f, 0.0f)
                horizontalLineToRelative(0.006f)
                lineToRelative(2.469f, 2.463f)
                curveToRelative(1.368f, -0.591f, 2.876f, -0.921f, 4.463f, -0.921f)
                curveTo(18.967f, 1.542f, 24.0f, 6.569f, 24.0f, 12.771f)
                curveTo(24.0f, 18.973f, 18.967f, 24.0f, 12.761f, 24.0f)
                curveTo(6.551f, 24.0f, 1.52f, 18.976f, 1.52f, 12.771f)
                curveToRelative(0.0f, -1.591f, 0.355f, -3.081f, 0.952f, -4.451f)
                lineToRelative(9.143f, 9.114f)
                curveToRelative(1.125f, -2.613f, 3.218f, -4.71f, 5.823f, -5.85f)
                lineToRelative(-9.135f, -9.12f)
                horizontalLineToRelative(-0.008f)
                curveToRelative(-2.606f, 1.14f, -4.695f, 3.24f, -5.823f, 5.85f)
                lineToRelative(0.003f, 0.003f)
                close()
            }
        }
        .build()
        return _livejournal!!
    }

private var _livejournal: ImageVector? = null
