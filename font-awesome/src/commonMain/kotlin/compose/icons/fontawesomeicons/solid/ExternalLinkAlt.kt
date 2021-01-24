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

public val SolidGroup.ExternalLinkAlt: ImageVector
    get() {
        if (_externalLinkAlt != null) {
            return _externalLinkAlt!!
        }
        _externalLinkAlt = Builder(name = "ExternalLinkAlt", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 320.0f)
                horizontalLineTo(400.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineTo(448.0f)
                horizontalLineTo(64.0f)
                verticalLineTo(128.0f)
                horizontalLineTo(208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(48.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 0.0f, 112.0f)
                verticalLineTo(464.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.0f, 48.0f)
                horizontalLineTo(400.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.0f, -48.0f)
                verticalLineTo(336.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 432.0f, 320.0f)
                close()
                moveTo(488.0f, 0.0f)
                horizontalLineToRelative(-128.0f)
                curveToRelative(-21.37f, 0.0f, -32.05f, 25.91f, -17.0f, 41.0f)
                lineToRelative(35.73f, 35.73f)
                lineTo(135.0f, 320.37f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, 34.0f)
                lineTo(157.67f, 377.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 34.0f, 0.0f)
                lineTo(435.28f, 133.32f)
                lineTo(471.0f, 169.0f)
                curveToRelative(15.0f, 15.0f, 41.0f, 4.5f, 41.0f, -17.0f)
                verticalLineTo(24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 488.0f, 0.0f)
                close()
            }
        }
        .build()
        return _externalLinkAlt!!
    }

private var _externalLinkAlt: ImageVector? = null
