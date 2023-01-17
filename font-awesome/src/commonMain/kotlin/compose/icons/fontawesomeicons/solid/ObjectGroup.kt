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

public val SolidGroup.ObjectGroup: ImageVector
    get() {
        if (_objectGroup != null) {
            return _objectGroup!!
        }
        _objectGroup = Builder(name = "ObjectGroup", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 119.4f)
                curveTo(12.9f, 108.4f, 0.0f, 87.7f, 0.0f, 64.0f)
                curveTo(0.0f, 28.7f, 28.7f, 0.0f, 64.0f, 0.0f)
                curveToRelative(23.7f, 0.0f, 44.4f, 12.9f, 55.4f, 32.0f)
                horizontalLineTo(456.6f)
                curveTo(467.6f, 12.9f, 488.3f, 0.0f, 512.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                curveToRelative(0.0f, 23.7f, -12.9f, 44.4f, -32.0f, 55.4f)
                verticalLineTo(392.6f)
                curveToRelative(19.1f, 11.1f, 32.0f, 31.7f, 32.0f, 55.4f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                curveToRelative(-23.7f, 0.0f, -44.4f, -12.9f, -55.4f, -32.0f)
                horizontalLineTo(119.4f)
                curveToRelative(-11.1f, 19.1f, -31.7f, 32.0f, -55.4f, 32.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                curveToRelative(0.0f, -23.7f, 12.9f, -44.4f, 32.0f, -55.4f)
                verticalLineTo(119.4f)
                close()
                moveTo(456.6f, 96.0f)
                horizontalLineTo(119.4f)
                curveToRelative(-5.6f, 9.7f, -13.7f, 17.8f, -23.4f, 23.4f)
                verticalLineTo(392.6f)
                curveToRelative(9.7f, 5.6f, 17.8f, 13.7f, 23.4f, 23.4f)
                horizontalLineTo(456.6f)
                curveToRelative(5.6f, -9.7f, 13.7f, -17.8f, 23.4f, -23.4f)
                verticalLineTo(119.4f)
                curveToRelative(-9.7f, -5.6f, -17.8f, -13.7f, -23.4f, -23.4f)
                close()
                moveTo(128.0f, 160.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineTo(288.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(160.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(160.0f)
                close()
                moveTo(256.0f, 320.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                verticalLineTo(224.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(288.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(320.0f)
                close()
            }
        }
        .build()
        return _objectGroup!!
    }

private var _objectGroup: ImageVector? = null
