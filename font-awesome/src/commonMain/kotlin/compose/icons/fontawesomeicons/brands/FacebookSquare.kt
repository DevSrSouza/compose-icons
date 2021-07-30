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

public val BrandsGroup.FacebookSquare: ImageVector
    get() {
        if (_facebookSquare != null) {
            return _facebookSquare!!
        }
        _facebookSquare = Builder(name = "FacebookSquare", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 32.0f)
                horizontalLineTo(48.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 0.0f, 80.0f)
                verticalLineToRelative(352.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.0f, 48.0f)
                horizontalLineToRelative(137.25f)
                verticalLineTo(327.69f)
                horizontalLineToRelative(-63.0f)
                verticalLineTo(256.0f)
                horizontalLineToRelative(63.0f)
                verticalLineToRelative(-54.64f)
                curveToRelative(0.0f, -62.15f, 37.0f, -96.48f, 93.67f, -96.48f)
                curveToRelative(27.14f, 0.0f, 55.52f, 4.84f, 55.52f, 4.84f)
                verticalLineToRelative(61.0f)
                horizontalLineToRelative(-31.27f)
                curveToRelative(-30.81f, 0.0f, -40.42f, 19.12f, -40.42f, 38.73f)
                verticalLineTo(256.0f)
                horizontalLineToRelative(68.78f)
                lineToRelative(-11.0f, 71.69f)
                horizontalLineToRelative(-57.78f)
                verticalLineTo(480.0f)
                horizontalLineTo(400.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.0f, -48.0f)
                verticalLineTo(80.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -48.0f, -48.0f)
                close()
            }
        }
        .build()
        return _facebookSquare!!
    }

private var _facebookSquare: ImageVector? = null
