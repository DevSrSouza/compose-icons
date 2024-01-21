package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 352.0f)
                curveToRelative(97.2f, 0.0f, 176.0f, -78.8f, 176.0f, -176.0f)
                reflectiveCurveTo(433.2f, 0.0f, 336.0f, 0.0f)
                reflectiveCurveTo(160.0f, 78.8f, 160.0f, 176.0f)
                curveToRelative(0.0f, 18.7f, 2.9f, 36.8f, 8.3f, 53.7f)
                lineTo(7.0f, 391.0f)
                curveToRelative(-4.5f, 4.5f, -7.0f, 10.6f, -7.0f, 17.0f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                verticalLineTo(448.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                verticalLineTo(384.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(6.4f, 0.0f, 12.5f, -2.5f, 17.0f, -7.0f)
                lineToRelative(33.3f, -33.3f)
                curveToRelative(16.9f, 5.4f, 35.0f, 8.3f, 53.7f, 8.3f)
                close()
                moveTo(376.0f, 96.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 0.0f, 80.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 0.0f, -80.0f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
