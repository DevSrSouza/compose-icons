package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.FiberNew: ImageVector
    get() {
        if (_fiberNew != null) {
            return _fiberNew!!
        }
        _fiberNew = Builder(name = "FiberNew", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.25f, 12.5f)
                lineTo(4.75f, 9.0f)
                lineTo(3.5f, 9.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(-3.5f)
                lineTo(7.3f, 15.0f)
                horizontalLineToRelative(1.2f)
                lineTo(8.5f, 9.0f)
                lineTo(7.25f, 9.0f)
                close()
                moveTo(9.5f, 15.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.25f)
                lineTo(11.0f, 13.75f)
                verticalLineToRelative(-1.11f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-1.26f)
                lineTo(11.0f, 11.38f)
                verticalLineToRelative(-1.12f)
                horizontalLineToRelative(2.5f)
                lineTo(13.5f, 9.0f)
                horizontalLineToRelative(-4.0f)
                close()
                moveTo(19.25f, 9.0f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-1.12f)
                lineTo(18.13f, 9.99f)
                horizontalLineToRelative(-1.25f)
                verticalLineToRelative(3.52f)
                horizontalLineToRelative(-1.13f)
                lineTo(15.75f, 9.0f)
                lineTo(14.5f, 9.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                lineTo(20.5f, 9.0f)
                horizontalLineToRelative(-1.25f)
                close()
            }
        }
        .build()
        return _fiberNew!!
    }

private var _fiberNew: ImageVector? = null
