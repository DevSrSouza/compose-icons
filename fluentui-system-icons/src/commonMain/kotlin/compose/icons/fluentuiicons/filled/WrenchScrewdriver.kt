package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.WrenchScrewdriver: ImageVector
    get() {
        if (_wrenchScrewdriver != null) {
            return _wrenchScrewdriver!!
        }
        _wrenchScrewdriver = Builder(name = "WrenchScrewdriver", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0792f, 2.4146f)
                curveTo(16.2062f, 2.1605f, 16.4659f, 2.0f, 16.75f, 2.0f)
                horizontalLineTo(18.25f)
                curveTo(18.5341f, 2.0f, 18.7938f, 2.1605f, 18.9208f, 2.4146f)
                lineTo(19.9208f, 4.4146f)
                curveTo(20.033f, 4.6389f, 20.0256f, 4.9044f, 19.9012f, 5.1221f)
                lineTo(19.0f, 6.6992f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 12.0f, 21.0f, 12.3358f, 21.0f, 12.75f)
                verticalLineTo(14.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.75f)
                curveTo(14.0f, 12.3358f, 14.3358f, 12.0f, 14.75f, 12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.6992f)
                lineTo(15.0988f, 5.1221f)
                curveTo(14.9744f, 4.9044f, 14.967f, 4.6389f, 15.0792f, 4.4146f)
                lineTo(16.0792f, 2.4146f)
                close()
                moveTo(14.0f, 16.0f)
                verticalLineTo(18.5f)
                curveTo(14.0f, 20.433f, 15.567f, 22.0f, 17.5f, 22.0f)
                curveTo(19.433f, 22.0f, 21.0f, 20.433f, 21.0f, 18.5f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(8.8285f, 2.2123f)
                curveTo(9.034f, 2.0727f, 9.2954f, 2.0439f, 9.5263f, 2.1355f)
                curveTo(11.5598f, 2.9418f, 13.0f, 4.9268f, 13.0f, 7.25f)
                curveTo(13.0f, 9.3741f, 11.7961f, 11.2154f, 10.0357f, 12.1317f)
                verticalLineTo(19.4641f)
                curveTo(10.0357f, 20.8645f, 8.9004f, 21.9998f, 7.5f, 21.9998f)
                curveTo(6.0996f, 21.9998f, 4.9643f, 20.8645f, 4.9643f, 19.4641f)
                verticalLineTo(12.1317f)
                curveTo(3.2039f, 11.2154f, 2.0f, 9.3741f, 2.0f, 7.25f)
                curveTo(2.0f, 4.9269f, 3.44f, 2.9419f, 5.4734f, 2.1356f)
                curveTo(5.7044f, 2.044f, 5.9658f, 2.0728f, 6.1713f, 2.2124f)
                curveTo(6.3768f, 2.352f, 6.4999f, 2.5843f, 6.4999f, 2.8328f)
                verticalLineTo(6.4999f)
                curveTo(6.4999f, 7.0522f, 6.9476f, 7.4999f, 7.4999f, 7.4999f)
                curveTo(8.0522f, 7.4999f, 8.4999f, 7.0522f, 8.4999f, 6.4999f)
                verticalLineTo(2.8327f)
                curveTo(8.4999f, 2.5842f, 8.6229f, 2.3519f, 8.8285f, 2.2123f)
                close()
            }
        }
        .build()
        return _wrenchScrewdriver!!
    }

private var _wrenchScrewdriver: ImageVector? = null
