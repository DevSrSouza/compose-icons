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

public val BaselineGroup.GppBad: ImageVector
    get() {
        if (_gppBad != null) {
            return _gppBad!!
        }
        _gppBad = Builder(name = "GppBad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(6.09f)
                curveToRelative(0.0f, 5.05f, 3.41f, 9.76f, 8.0f, 10.91f)
                curveToRelative(4.59f, -1.15f, 8.0f, -5.86f, 8.0f, -10.91f)
                verticalLineTo(5.0f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(15.5f, 14.09f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(12.0f, 13.42f)
                lineTo(9.91f, 15.5f)
                lineTo(8.5f, 14.09f)
                lineTo(10.59f, 12.0f)
                lineTo(8.5f, 9.91f)
                lineTo(9.91f, 8.5f)
                lineTo(12.0f, 10.59f)
                lineToRelative(2.09f, -2.09f)
                lineToRelative(1.41f, 1.41f)
                lineTo(13.42f, 12.0f)
                lineTo(15.5f, 14.09f)
                close()
            }
        }
        .build()
        return _gppBad!!
    }

private var _gppBad: ImageVector? = null
