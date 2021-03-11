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

public val SimpleIcons.Pluscodes: ImageVector
    get() {
        if (_pluscodes != null) {
            return _pluscodes!!
        }
        _pluscodes = Builder(name = "Pluscodes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.578f, 14.583f)
                arcTo(2.58f, 2.58f, 0.0f, false, true, 0.0f, 12.0f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, true, 2.578f, -2.584f)
                arcTo(2.58f, 2.58f, 0.0f, false, true, 5.156f, 12.0f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, true, -2.578f, 2.583f)
                close()
                moveTo(12.064f, 5.206f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, true, -2.579f, -2.584f)
                arcTo(2.58f, 2.58f, 0.0f, false, true, 12.064f, 0.038f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, true, 2.578f, 2.584f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, true, -2.578f, 2.584f)
                close()
                moveTo(21.422f, 14.583f)
                arcTo(2.58f, 2.58f, 0.0f, false, true, 18.844f, 12.0f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, true, 2.578f, -2.584f)
                arcTo(2.58f, 2.58f, 0.0f, false, true, 24.0f, 12.0f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, true, -2.578f, 2.583f)
                close()
                moveTo(14.642f, 21.378f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, true, -2.578f, 2.584f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, true, -2.579f, -2.584f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, true, 2.579f, -2.584f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, true, 2.578f, 2.584f)
                moveToRelative(-2.578f, -6.795f)
                arcTo(2.58f, 2.58f, 0.0f, false, true, 9.485f, 12.0f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, true, 2.579f, -2.584f)
                arcTo(2.58f, 2.58f, 0.0f, false, true, 14.642f, 12.0f)
                arcToRelative(2.58f, 2.58f, 0.0f, false, true, -2.578f, 2.583f)
                close()
            }
        }
        .build()
        return _pluscodes!!
    }

private var _pluscodes: ImageVector? = null
