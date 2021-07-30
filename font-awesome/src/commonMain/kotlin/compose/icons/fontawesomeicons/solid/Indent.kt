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

public val SolidGroup.Indent: ImageVector
    get() {
        if (_indent != null) {
            return _indent!!
        }
        _indent = Builder(name = "Indent", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.31f, 363.3f)
                lineToRelative(96.0f, -96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.62f)
                lineToRelative(-96.0f, -96.0f)
                curveTo(17.27f, 138.66f, 0.0f, 145.78f, 0.0f, 160.0f)
                verticalLineToRelative(192.0f)
                curveToRelative(0.0f, 14.31f, 17.33f, 21.3f, 27.31f, 11.3f)
                close()
                moveTo(432.0f, 416.0f)
                lineTo(16.0f, 416.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(416.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                close()
                moveTo(435.17f, 288.0f)
                lineTo(204.83f, 288.0f)
                arcTo(12.82f, 12.82f, 0.0f, false, false, 192.0f, 300.83f)
                verticalLineToRelative(38.34f)
                arcTo(12.82f, 12.82f, 0.0f, false, false, 204.83f, 352.0f)
                horizontalLineToRelative(230.34f)
                arcTo(12.82f, 12.82f, 0.0f, false, false, 448.0f, 339.17f)
                verticalLineToRelative(-38.34f)
                arcTo(12.82f, 12.82f, 0.0f, false, false, 435.17f, 288.0f)
                close()
                moveTo(435.17f, 160.0f)
                lineTo(204.83f, 160.0f)
                arcTo(12.82f, 12.82f, 0.0f, false, false, 192.0f, 172.83f)
                verticalLineToRelative(38.34f)
                arcTo(12.82f, 12.82f, 0.0f, false, false, 204.83f, 224.0f)
                horizontalLineToRelative(230.34f)
                arcTo(12.82f, 12.82f, 0.0f, false, false, 448.0f, 211.17f)
                verticalLineToRelative(-38.34f)
                arcTo(12.82f, 12.82f, 0.0f, false, false, 435.17f, 160.0f)
                close()
                moveTo(432.0f, 32.0f)
                lineTo(16.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 0.0f, 48.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(416.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(448.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _indent!!
    }

private var _indent: ImageVector? = null
