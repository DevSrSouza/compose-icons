package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.OfflinePin: ImageVector
    get() {
        if (_offlinePin != null) {
            return _offlinePin!!
        }
        _offlinePin = Builder(name = "OfflinePin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.5f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.5f, 10.0f, -10.0f)
                reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(17.0f, 18.0f)
                lineTo(7.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(10.3f, 14.0f)
                lineTo(7.0f, 10.7f)
                lineToRelative(1.4f, -1.4f)
                lineToRelative(1.9f, 1.9f)
                lineToRelative(5.3f, -5.3f)
                lineTo(17.0f, 7.3f)
                lineTo(10.3f, 14.0f)
                close()
            }
        }
        .build()
        return _offlinePin!!
    }

private var _offlinePin: ImageVector? = null
