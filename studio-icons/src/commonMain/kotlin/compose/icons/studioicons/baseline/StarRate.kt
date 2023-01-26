package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.StarRate: ImageVector
    get() {
        if (_starRate != null) {
            return _starRate!!
        }
        _starRate = Builder(name = "StarRate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.43f, 10.0f)
                lineToRelative(-2.43f, -8.0f)
                lineToRelative(-2.43f, 8.0f)
                lineToRelative(-7.57f, 0.0f)
                lineToRelative(6.18f, 4.41f)
                lineToRelative(-2.35f, 7.59f)
                lineToRelative(6.17f, -4.69f)
                lineToRelative(6.18f, 4.69f)
                lineToRelative(-2.35f, -7.59f)
                lineToRelative(6.17f, -4.41f)
                close()
            }
        }
        .build()
        return _starRate!!
    }

private var _starRate: ImageVector? = null
