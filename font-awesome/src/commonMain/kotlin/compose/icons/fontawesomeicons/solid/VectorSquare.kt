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

public val SolidGroup.VectorSquare: ImageVector
    get() {
        if (_vectorSquare != null) {
            return _vectorSquare!!
        }
        _vectorSquare = Builder(name = "VectorSquare", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 128.0f)
                lineTo(512.0f, 32.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                horizontalLineToRelative(-96.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                lineTo(160.0f, 32.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                lineTo(32.0f, 0.0f)
                curveTo(14.33f, 0.0f, 0.0f, 14.33f, 0.0f, 32.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                verticalLineToRelative(192.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                horizontalLineToRelative(192.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                verticalLineToRelative(-96.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                lineTo(480.0f, 160.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                close()
                moveTo(416.0f, 64.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(-32.0f)
                lineTo(416.0f, 64.0f)
                close()
                moveTo(64.0f, 64.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(32.0f)
                lineTo(64.0f, 96.0f)
                lineTo(64.0f, 64.0f)
                close()
                moveTo(96.0f, 448.0f)
                lineTo(64.0f, 448.0f)
                verticalLineToRelative(-32.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(32.0f)
                close()
                moveTo(448.0f, 448.0f)
                horizontalLineToRelative(-32.0f)
                verticalLineToRelative(-32.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(32.0f)
                close()
                moveTo(416.0f, 352.0f)
                horizontalLineToRelative(-32.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                verticalLineToRelative(32.0f)
                lineTo(160.0f, 416.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                lineTo(96.0f, 352.0f)
                lineTo(96.0f, 160.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                lineTo(160.0f, 96.0f)
                horizontalLineToRelative(192.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(192.0f)
                close()
            }
        }
        .build()
        return _vectorSquare!!
    }

private var _vectorSquare: ImageVector? = null
