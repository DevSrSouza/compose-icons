package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.AlignRight: ImageVector
    get() {
        if (_alignRight != null) {
            return _alignRight!!
        }
        _alignRight = Builder(name = "AlignRight", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 224.0f)
                horizontalLineToRelative(416.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(16.0f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
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
                moveTo(435.17f, 32.0f)
                lineTo(172.83f, 32.0f)
                arcTo(12.82f, 12.82f, 0.0f, false, false, 160.0f, 44.83f)
                verticalLineToRelative(38.34f)
                arcTo(12.82f, 12.82f, 0.0f, false, false, 172.83f, 96.0f)
                horizontalLineToRelative(262.34f)
                arcTo(12.82f, 12.82f, 0.0f, false, false, 448.0f, 83.17f)
                lineTo(448.0f, 44.83f)
                arcTo(12.82f, 12.82f, 0.0f, false, false, 435.17f, 32.0f)
                close()
                moveTo(435.17f, 288.0f)
                lineTo(172.83f, 288.0f)
                arcTo(12.82f, 12.82f, 0.0f, false, false, 160.0f, 300.83f)
                verticalLineToRelative(38.34f)
                arcTo(12.82f, 12.82f, 0.0f, false, false, 172.83f, 352.0f)
                horizontalLineToRelative(262.34f)
                arcTo(12.82f, 12.82f, 0.0f, false, false, 448.0f, 339.17f)
                verticalLineToRelative(-38.34f)
                arcTo(12.82f, 12.82f, 0.0f, false, false, 435.17f, 288.0f)
                close()
            }
        }
        .build()
        return _alignRight!!
    }

private var _alignRight: ImageVector? = null
