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

public val SolidGroup.Landmark: ImageVector
    get() {
        if (_landmark != null) {
            return _landmark!!
        }
        _landmark = Builder(name = "Landmark", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(501.62f, 92.11f)
                lineTo(267.24f, 2.04f)
                arcToRelative(31.96f, 31.96f, 0.0f, false, false, -22.47f, 0.0f)
                lineTo(10.38f, 92.11f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 0.0f, 107.09f)
                lineTo(0.0f, 144.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(480.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-36.91f)
                curveToRelative(0.0f, -6.67f, -4.14f, -12.64f, -10.38f, -14.98f)
                close()
                moveTo(64.0f, 192.0f)
                verticalLineToRelative(160.0f)
                lineTo(48.0f, 352.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(448.0f)
                verticalLineToRelative(-48.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                horizontalLineToRelative(-16.0f)
                lineTo(448.0f, 192.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(160.0f)
                horizontalLineToRelative(-96.0f)
                lineTo(288.0f, 192.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(160.0f)
                horizontalLineToRelative(-96.0f)
                lineTo(128.0f, 192.0f)
                lineTo(64.0f, 192.0f)
                close()
                moveTo(496.0f, 448.0f)
                lineTo(16.0f, 448.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(480.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _landmark!!
    }

private var _landmark: ImageVector? = null
