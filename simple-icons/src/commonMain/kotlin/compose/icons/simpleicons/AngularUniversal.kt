package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.AngularUniversal: ImageVector
    get() {
        if (_angularUniversal != null) {
            return _angularUniversal!!
        }
        _angularUniversal = Builder(name = "AngularUniversal", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.6f, 11.28f)
                verticalLineToRelative(1.44f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, true, -0.48f, 0.48f)
                lineTo(8.88f, 13.2f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, true, -0.48f, -0.48f)
                verticalLineToRelative(-1.44f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, true, 0.48f, -0.48f)
                horizontalLineToRelative(6.24f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, true, 0.48f, 0.48f)
                close()
                moveTo(12.0f, 15.6f)
                arcToRelative(1.2f, 1.2f, 0.0f, true, false, 0.0f, 2.4f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, 0.0f, -2.4f)
                close()
                moveTo(15.12f, 7.2f)
                lineTo(8.88f, 7.2f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, false, -0.48f, 0.48f)
                verticalLineToRelative(1.44f)
                curveToRelative(0.0f, 0.265f, 0.215f, 0.48f, 0.48f, 0.48f)
                horizontalLineToRelative(6.24f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, false, 0.48f, -0.48f)
                lineTo(15.6f, 7.68f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, false, -0.48f, -0.48f)
                close()
                moveTo(23.16f, 3.996f)
                lineToRelative(-1.716f, 14.736f)
                lineTo(11.976f, 24.0f)
                lineTo(2.52f, 18.732f)
                lineTo(0.84f, 3.996f)
                lineTo(11.976f, 0.0f)
                lineTo(23.16f, 3.996f)
                close()
                moveTo(16.8f, 6.24f)
                arcToRelative(1.44f, 1.44f, 0.0f, false, false, -1.44f, -1.44f)
                lineTo(8.64f, 4.8f)
                arcTo(1.44f, 1.44f, 0.0f, false, false, 7.2f, 6.24f)
                verticalLineToRelative(11.52f)
                curveToRelative(0.0f, 0.795f, 0.645f, 1.44f, 1.44f, 1.44f)
                horizontalLineToRelative(6.72f)
                arcToRelative(1.44f, 1.44f, 0.0f, false, false, 1.44f, -1.44f)
                lineTo(16.8f, 6.24f)
                close()
            }
        }
        .build()
        return _angularUniversal!!
    }

private var _angularUniversal: ImageVector? = null
