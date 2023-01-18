package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Highlight: ImageVector
    get() {
        if (_highlight != null) {
            return _highlight!!
        }
        _highlight = Builder(name = "Highlight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.2586f, 2.0039f)
                curveTo(20.6383f, 2.0043f, 20.9518f, 2.2867f, 21.0011f, 2.6528f)
                lineTo(21.0079f, 2.7546f)
                lineTo(21.0038f, 7.2523f)
                curveTo(21.0009f, 8.4086f, 20.1271f, 9.3603f, 19.0029f, 9.4862f)
                lineTo(19.0025f, 11.746f)
                curveTo(19.0025f, 12.9369f, 18.0773f, 13.9117f, 16.9065f, 13.9908f)
                lineTo(16.7525f, 13.996f)
                lineTo(16.501f, 13.9959f)
                lineTo(16.5018f, 16.7876f)
                curveTo(16.5018f, 17.6026f, 16.0617f, 18.3489f, 15.3601f, 18.7458f)
                lineTo(15.2058f, 18.8254f)
                lineTo(8.5711f, 21.9317f)
                curveTo(8.1048f, 22.1499f, 7.5741f, 21.8446f, 7.5096f, 21.3531f)
                lineTo(7.5031f, 21.2524f)
                lineTo(7.503f, 13.9959f)
                lineTo(7.25f, 13.996f)
                curveTo(6.0591f, 13.996f, 5.0844f, 13.0708f, 5.0052f, 11.9001f)
                lineTo(5.0f, 11.746f)
                lineTo(5.0004f, 9.4867f)
                curveTo(3.9288f, 9.3685f, 3.0839f, 8.4976f, 3.0059f, 7.4144f)
                lineTo(3.0f, 7.2504f)
                verticalLineTo(2.7539f)
                curveTo(3.0f, 2.3397f, 3.3358f, 2.0039f, 3.75f, 2.0039f)
                curveTo(4.1297f, 2.0039f, 4.4435f, 2.2861f, 4.4932f, 2.6521f)
                lineTo(4.5f, 2.7539f)
                verticalLineTo(7.2504f)
                curveTo(4.5f, 7.6301f, 4.7821f, 7.9439f, 5.1482f, 7.9935f)
                lineTo(5.25f, 8.0004f)
                lineTo(18.7513f, 8.0004f)
                curveTo(19.1316f, 7.9998f, 19.4461f, 7.7171f, 19.4967f, 7.3514f)
                lineTo(19.5038f, 7.2497f)
                lineTo(19.5079f, 2.7532f)
                curveTo(19.5083f, 2.339f, 19.8444f, 2.0035f, 20.2586f, 2.0039f)
                close()
                moveTo(15.001f, 13.9959f)
                horizontalLineTo(9.003f)
                lineTo(9.0031f, 20.0731f)
                lineTo(14.5698f, 17.4669f)
                curveTo(14.8004f, 17.3589f, 14.9582f, 17.1427f, 14.994f, 16.8953f)
                lineTo(15.0018f, 16.7876f)
                lineTo(15.001f, 13.9959f)
                close()
                moveTo(17.502f, 9.4999f)
                horizontalLineTo(6.5f)
                verticalLineTo(11.746f)
                curveTo(6.5f, 12.1257f, 6.7821f, 12.4395f, 7.1482f, 12.4892f)
                lineTo(7.25f, 12.496f)
                horizontalLineTo(16.7525f)
                curveTo(17.1322f, 12.496f, 17.446f, 12.2139f, 17.4956f, 11.8478f)
                lineTo(17.5025f, 11.746f)
                lineTo(17.502f, 9.4999f)
                close()
            }
        }
        .build()
        return _highlight!!
    }

private var _highlight: ImageVector? = null
