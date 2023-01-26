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

public val BaselineGroup.OfflineShare: ImageVector
    get() {
        if (_offlineShare != null) {
            return _offlineShare!!
        }
        _offlineShare = Builder(name = "OfflineShare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.6f, 10.26f)
                verticalLineToRelative(1.31f)
                lineTo(17.0f, 9.33f)
                lineTo(14.6f, 7.1f)
                verticalLineToRelative(1.28f)
                curveToRelative(-2.33f, 0.32f, -3.26f, 1.92f, -3.6f, 3.52f)
                curveToRelative(0.83f, -1.13f, 1.93f, -1.64f, 3.6f, -1.64f)
                close()
                moveTo(16.0f, 23.0f)
                lineTo(6.0f, 23.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                lineTo(4.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(18.0f, 1.0f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(20.0f, 3.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(18.0f, 16.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(10.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(12.0f)
                close()
            }
        }
        .build()
        return _offlineShare!!
    }

private var _offlineShare: ImageVector? = null
