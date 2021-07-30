package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.LinkedinIn: ImageVector
    get() {
        if (_linkedinIn != null) {
            return _linkedinIn!!
        }
        _linkedinIn = Builder(name = "LinkedinIn", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.28f, 448.0f)
                horizontalLineTo(7.4f)
                verticalLineTo(148.9f)
                horizontalLineToRelative(92.88f)
                close()
                moveTo(53.79f, 108.1f)
                curveTo(24.09f, 108.1f, 0.0f, 83.5f, 0.0f, 53.8f)
                arcToRelative(53.79f, 53.79f, 0.0f, false, true, 107.58f, 0.0f)
                curveToRelative(0.0f, 29.7f, -24.1f, 54.3f, -53.79f, 54.3f)
                close()
                moveTo(447.9f, 448.0f)
                horizontalLineToRelative(-92.68f)
                verticalLineTo(302.4f)
                curveToRelative(0.0f, -34.7f, -0.7f, -79.2f, -48.29f, -79.2f)
                curveToRelative(-48.29f, 0.0f, -55.69f, 37.7f, -55.69f, 76.7f)
                verticalLineTo(448.0f)
                horizontalLineToRelative(-92.78f)
                verticalLineTo(148.9f)
                horizontalLineToRelative(89.08f)
                verticalLineToRelative(40.8f)
                horizontalLineToRelative(1.3f)
                curveToRelative(12.4f, -23.5f, 42.69f, -48.3f, 87.88f, -48.3f)
                curveToRelative(94.0f, 0.0f, 111.28f, 61.9f, 111.28f, 142.3f)
                verticalLineTo(448.0f)
                close()
            }
        }
        .build()
        return _linkedinIn!!
    }

private var _linkedinIn: ImageVector? = null
